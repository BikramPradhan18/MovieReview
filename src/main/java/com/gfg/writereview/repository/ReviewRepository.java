package com.gfg.writereview.repository;

import com.gfg.writereview.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReviewRepository extends JpaRepository<Review , Long>{
    @Query(value = "select avg(rating) from review_table where movie_id=?",nativeQuery = true)
    Double getReviewAverage(Long id);
}
