package com.springmetadata.springmetadata.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class ContentFiltering implements Filter {
    public String[] getRecommendations(String movie){


        return new String[]{"Italain Job","Mission Impossible", "MI3"};
    }
}
