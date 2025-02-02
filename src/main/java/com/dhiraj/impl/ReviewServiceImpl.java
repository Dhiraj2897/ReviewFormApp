package com.dhiraj.impl;

import com.dhiraj.Service.ReviewService;
import com.dhiraj.dto.ReviewDTO;
import com.dhiraj.entity.Review;
import com.dhiraj.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;


    @Override
    public Review saveReview(ReviewDTO reviewDTO) {

        Review review= new Review();
        review.setName(reviewDTO.getName());
        review.setEmail(reviewDTO.getEmail());
        review.setRating(reviewDTO.getRating());
        review.setComment(reviewDTO.getComment());

        return reviewRepository.save(review);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
