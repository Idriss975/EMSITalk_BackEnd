package com.programming.Idriss.EMSITALK.repository;

import com.programming.Idriss.EMSITALK.model.Post;
import com.programming.Idriss.EMSITALK.model.Topic;
import com.programming.Idriss.EMSITALK.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByTopic(Topic topic);

    List<Post> findByUser(User user);
}
