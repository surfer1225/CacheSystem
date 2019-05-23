package io.cachesystem.service;

import io.cachesystem.repo.BackingStore;
import io.cachesystem.repo.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReadServiceImpl implements ReadService {

    @Autowired
    private BackingStore backing_store;

    @Autowired
    private Cache cache;

    @Override
    public String read(String key) {
        return cache.read(key).orElse(backing_store.read(key));
    }
}
