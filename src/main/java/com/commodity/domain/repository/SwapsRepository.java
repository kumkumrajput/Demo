package com.commodity.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.commodity.domain.model.Swaps;

@Repository
public interface SwapsRepository extends PagingAndSortingRepository<Swaps, Integer>{

}
