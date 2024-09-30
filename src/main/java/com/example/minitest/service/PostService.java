package com.example.minitest.service;

import com.example.minitest.model.Post;
import com.example.minitest.model.dto.ICountPost;
import com.example.minitest.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService implements IPostService {
    @Autowired
    private IPostRepository postRepository;

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> findById(long id) {
        return postRepository.findById(id);
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void delete(Long id) {
        postRepository.deleteById(id);
    }

    @Override
    public Iterable<ICountPost> countCustomerByProvice() {
        return postRepository.getNumberOfPostByCategory();
    }
}
