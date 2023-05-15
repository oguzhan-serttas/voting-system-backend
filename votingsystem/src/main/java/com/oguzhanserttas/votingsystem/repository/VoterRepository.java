package com.oguzhanserttas.votingsystem.repository;


import com.oguzhanserttas.votingsystem.model.Voter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepository extends JpaRepository<Voter,Integer> {
}
