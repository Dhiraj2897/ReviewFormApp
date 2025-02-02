package com.dhiraj.impl;

import com.dhiraj.Service.ReviewService;
import com.dhiraj.dto.ReviewDTO;
import com.dhiraj.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public Review saveReview(ReviewDTO reviewDTO) {
        return null;
    }

    @Override
    public List<Review> getAllReviews() {
        return List.of();
    }
}
