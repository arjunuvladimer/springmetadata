package com.springmetadata.springmetadata;

import com.springmetadata.springmetadata.configuration.RecommendedMovieImpmenetation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;


public class SpringmetadataApplication {

	public static void main(String[] args) {


		// Change from Application Context to Configuration
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		System.out.println("Bean Definition Names");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

		RecommendedMovieImpmenetation recommender = appContext.getBean("recommendedMovieImplementation", RecommendedMovieImpmenetation.class);

		String[] movies = recommender.recommendMovie("ET");

		System.out.println(Arrays.toString(movies));


	}

}
