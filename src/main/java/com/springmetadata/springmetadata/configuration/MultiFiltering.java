package com.springmetadata.springmetadata.configuration;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class MultiFiltering implements Filter {
    public String[] getRecommendations(String movie){
        return new String[]{"Ice Age", "Toy Story", "Evil Dead"};
    }
}

//    Spring Container =>  Private Filter filter [AutoWired] => @Primary MultiFiltering on ContentFiltering
//
//        => Creates Instances @Component
//        => @AutoWiring Filter => It Check for the instances that are of type Filter
//        => @Primary => RecommendedMovieImplementations(Filter Multifiltering)
//
