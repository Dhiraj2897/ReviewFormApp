package com.dhiraj.Service;

import com.dhiraj.dto.ReviewDTO;
import com.dhiraj.entity.Review;

import java.util.List;

public interface ReviewService {
Review saveReview(ReviewDTO reviewDTO);
    List<Review> getAllReviews();
}
