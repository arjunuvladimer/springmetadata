package com.springmetadata.springmetadata.componentScan;

import com.springmetadata.springmetadata.configuration.Filter;

public class CheckComponentScan implements Filter {
    public String[] getRecommendations(String movie){


        return new String[]{"MI1","MI1", "MI3"};
    }
}
