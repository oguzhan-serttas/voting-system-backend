package com.oguzhanserttas.votingsystem.service;


import com.oguzhanserttas.votingsystem.model.Voter;
import com.oguzhanserttas.votingsystem.repository.VoterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterServiceImpl implements VoterService {

    @Autowired
    private VoterRepository voterRepository;

    @Override
    public Voter saveVoter(Voter voter) {
        return voterRepository.save(voter);
    }

    @Override
    public Voter getVoterById(int id) {
        return voterRepository.findById(id).get();
    }

    @Override
    public Iterable<Voter> getAllVoters() {
        return voterRepository.findAll();
    }

    @Override
    public void deleteVoterById(int id) {
        voterRepository.deleteById(id);
    }


}
