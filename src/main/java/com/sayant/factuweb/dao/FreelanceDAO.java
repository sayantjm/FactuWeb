package com.sayant.factuweb.dao;

import com.sayant.factuweb.entity.Freelance;

import java.util.List;

public interface FreelanceDAO {
    public Freelance findById(Long id);

    public Freelance save(Freelance Freelance);

    public boolean remove(Long FreelanceId);

    public List<Freelance> findALL();
}
