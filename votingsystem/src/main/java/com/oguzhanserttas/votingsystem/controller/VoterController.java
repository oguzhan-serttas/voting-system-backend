package com.oguzhanserttas.votingsystem.controller;

import com.oguzhanserttas.votingsystem.model.Voter;
import com.oguzhanserttas.votingsystem.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/voter")
@CrossOrigin
public class VoterController {
    @Autowired
    private VoterService voterService;

    @PostMapping("/add")
    public String add(@RequestBody Voter voter) {
        voterService.saveVoter(voter);
        return "New voter is added";
    }

    @PutMapping("/update")
    public String update(@RequestBody Voter voter) {
        voterService.saveVoter(voter);
        return "Voter is updated";
    }

    @GetMapping("/get/{id}")
    public Voter get(@PathVariable int id) {
        return voterService.getVoterById(id);
    }

    @GetMapping("/get")
    public Iterable<Voter> getAll() {
        return voterService.getAllVoters();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        voterService.deleteVoterById(id);
        return "Voter is deleted";
    }




}
