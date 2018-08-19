package com.commodity.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.commodity.domain.model.Futures;

@Repository
public interface FuturesRepository extends PagingAndSortingRepository<Futures, Integer> {

}
