package com.tekkombud.application.service.messenger.impl;

import com.tekkombud.application.dao.CRUDRepository;
import com.tekkombud.application.entity.Messenger;
import com.tekkombud.application.entity.User;
import com.tekkombud.application.service.messenger.MessengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessengerServiceImpl implements MessengerService {
    @Autowired
    private CRUDRepository<Messenger> crudRepository;

    @Override
    @Transactional
    public void saveMessage(Messenger messenger) {
        crudRepository.save(messenger);
    }

    @Override
    public List<Messenger> getAllMessage() {
        crudRepository.setObjectClass(Messenger.class);
        return crudRepository.findALL();
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        crudRepository.setObjectClass(Messenger.class);
        crudRepository.delete(Long.valueOf(id));
    }
}
