package com.chj.service;

import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

/**
 * @author ：chj
 * @date ：Created in 2020/5/13 18:45
 * @params :
 */
@Service
public class RedisService {
    @Autowired
    private JedisCluster jedisCluster;
}
