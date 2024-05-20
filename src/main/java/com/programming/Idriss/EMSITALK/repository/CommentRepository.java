package com.programming.Idriss.EMSITALK.repository;

import com.programming.Idriss.EMSITALK.model.Comment;
import com.programming.Idriss.EMSITALK.model.Post;
import com.programming.Idriss.EMSITALK.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
