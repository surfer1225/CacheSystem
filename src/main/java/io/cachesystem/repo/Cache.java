package io.cachesystem.repo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class Cache {
    private Map<String, String> cache = new HashMap<>();

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void write(String key, String value) {
        logger.info("Started writing to backing store.");
        cache.put(key, value);
        logger.info("Finished writing to backing store.");
    }

    public Optional<String> read(String key) {
        logger.info("Started reading to backing store.");
        String val = cache.get(key);
        logger.info("Finished reading to backing store.");
        return Optional.ofNullable(val);
    }
}
