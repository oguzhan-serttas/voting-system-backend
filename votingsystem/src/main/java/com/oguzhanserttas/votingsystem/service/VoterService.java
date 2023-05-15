package com.oguzhanserttas.votingsystem.service;

import com.oguzhanserttas.votingsystem.model.Voter;

public interface VoterService {
    public Voter saveVoter(Voter voter);
    public Voter getVoterById(int id);
    public Iterable<Voter> getAllVoters();
    public void deleteVoterById(int id);

}
