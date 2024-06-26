package com.programming.Idriss.EMSITALK.repository;

import com.programming.Idriss.EMSITALK.model.Vote;
import com.programming.Idriss.EMSITALK.model.Post;
import com.programming.Idriss.EMSITALK.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
