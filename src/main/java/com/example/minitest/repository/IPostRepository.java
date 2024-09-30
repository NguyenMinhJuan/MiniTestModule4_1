package com.example.minitest.repository;

import com.example.minitest.model.Post;
import com.example.minitest.model.dto.ICountPost;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepository extends CrudRepository<Post, Long> {
    @Query(nativeQuery = true, value = "SELECT COUNT(*) AS so_luong_Post, c.category_id\n" +
            "FROM post p\n" +
            "JOIN category c ON p.category_id = c.category_id\n" +
            "GROUP BY c.category_id;")
    Iterable<ICountPost> getNumberOfPostByCategory();
}
