package com.commodity.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.commodity.domain.model.Futures;

@Repository
public interface FuturesRepository extends JpaRepository<Futures, Integer> {

}
