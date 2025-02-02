package com.dhiraj.controller;

import com.dhiraj.Service.ReviewService;
import com.dhiraj.dto.ReviewDTO;
import com.dhiraj.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;
    @GetMapping("/reviews")
    public String showReviewForm(Model model){
        model.addAttribute("reviewDTO", new ReviewDTO());
        return "reviewForm";
    }
    @PostMapping("/reviews")
    public String submitReview(@ModelAttribute ReviewDTO reviewDTO, Model model) {
        reviewService.saveReview(reviewDTO);
        model.addAttribute("message", "Thank you for your review!");
        return "reviewForm";
    }

    @GetMapping("/all-reviews")
    public String getAllReviews(Model model) {
        List<Review> reviews = reviewService.getAllReviews();
        model.addAttribute("reviews", reviews);
        return "allReviews";
    }
}
