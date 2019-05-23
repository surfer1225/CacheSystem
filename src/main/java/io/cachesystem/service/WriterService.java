package io.cachesystem.service;

public interface WriterService {

    void write_through(String key, String value);

    void write_around(String key, String value);

    void write_back(String key, String value);
}
