package com.fms.feedbackmanagementsystem4.repo;

import com.fms.feedbackmanagementsystem4.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Comments Repository.
 */
public interface CommentsRepo extends JpaRepository<Comment, Integer> {
}
