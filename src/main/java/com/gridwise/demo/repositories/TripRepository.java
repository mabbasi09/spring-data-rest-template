package com.gridwise.demo.repositories;

import com.gridwise.demo.domain.Trip;
import org.springframework.data.domain.Page;


import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource(path = "trips", collectionResourceRel = "trips")
public interface TripRepository extends PagingAndSortingRepository<Trip, Long> {

    Page<Trip> findAll(Pageable pageable);

    @RestResource(path = "filter", rel = "filter")
    @Query("select t from Trip t where (t.tripDistance is null or t.tripDistance = :tripDistance) and (t.fareAmount is null or t.fareAmount = :fareAmount)")
    Page<Trip> filter(@Param("tripDistance") Double tripDistance, @Param("fareAmount") Double fareAmount, Pageable pageable);

    @Override
    <S extends Trip> S save(S entity);
}
