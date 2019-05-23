package io.cachesystem.repo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BackingStore {

    private Map<String, String> db = new HashMap<>();

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void write(String key, String value) {
        logger.info("Started writing to backing store.");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        db.put(key, value);
        logger.info("Finished writing to backing store.");
    }

    public String read(String key) {
        logger.info("Started reading to backing store.");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String val = db.get(key);
        logger.info("Finished reading to backing store.");
        return val;
    }
}
