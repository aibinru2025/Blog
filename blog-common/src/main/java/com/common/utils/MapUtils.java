package com.common.utils;

import java.util.HashMap;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-1-17 11:11
 * @description:
 */
public class MapUtils extends HashMap<String,Object> {

    @Override
    public MapUtils put(String k,Object v){
        super.put(k,v);
        return this;
    }
}
