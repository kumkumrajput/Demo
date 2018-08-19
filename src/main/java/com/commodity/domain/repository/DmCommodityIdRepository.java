package com.commodity.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.commodity.domain.model.DmCommodityId;

@Repository
public interface DmCommodityIdRepository extends PagingAndSortingRepository<DmCommodityId, Integer> {

}
