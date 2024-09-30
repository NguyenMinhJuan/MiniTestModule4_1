package com.example.minitest.service;

import com.example.minitest.model.Post;
import com.example.minitest.model.dto.ICountPost;
import com.example.minitest.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public interface IPostService extends IGenerateService<Post>{
    Iterable<ICountPost> countCustomerByProvice();
}
