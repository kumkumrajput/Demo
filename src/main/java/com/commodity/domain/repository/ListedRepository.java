package com.commodity.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.commodity.domain.model.Listed;

@Repository
public interface ListedRepository extends PagingAndSortingRepository<Listed, Integer>{

}
