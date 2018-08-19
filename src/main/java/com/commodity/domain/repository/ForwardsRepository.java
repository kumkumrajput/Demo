package com.commodity.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.commodity.domain.model.Forwards;

@Repository
public interface ForwardsRepository extends PagingAndSortingRepository<Forwards, Integer> {

}
