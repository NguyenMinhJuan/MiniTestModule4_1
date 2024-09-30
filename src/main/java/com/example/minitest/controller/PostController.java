package com.example.minitest.controller;

import com.example.minitest.model.Category;
import com.example.minitest.model.Post;
import com.example.minitest.service.ICategoryService;
import com.example.minitest.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/post")
public class PostController {
    @Autowired
    private IPostService postService;
    @Autowired
    private ICategoryService categoryService;


    @ModelAttribute("categories")
    public Iterable<Category> listCategories() {
        return categoryService.findAll();
    }

    @GetMapping("")
    public ModelAndView index(){
        Iterable<Post> posts = postService.findAll();
        return new ModelAndView("/index","listPost",postService.findAll());
    }

    @GetMapping("/showCreate")
    public String showCreate(Model model){
        model.addAttribute("post", new Post());
        return "/create";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable ("id") long id){
        postService.delete(id);
        return "redirect:/post";
    }

    @GetMapping("/showUpdate/{id}")
    public String showUpdate(@PathVariable ("id") long id , Model model){
        Optional<Post> post = postService.findById(id);
        model.addAttribute("post", post.get());
        return "/update";
    }

    @GetMapping("/update/{id}")
    public String update(@ModelAttribute ("post") Post post){
        postService.save(post);
        return "redirect:/post";
    }

    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute Post post){
        postService.save(post);
        return new ModelAndView("redirect:/post");
    }

    @GetMapping("/count")
    public ModelAndView count(){
        return new ModelAndView("/count","countPost",postService.countCustomerByProvice());
    }

}
