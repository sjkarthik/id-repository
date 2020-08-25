package io.mosip.idrepository.bioextractor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

/**
 * Spring-boot class for Biometric Extractor Application.
 *
 * @author Loganathan Sekar
 */
@SpringBootApplication()
@Import(value = { RestTemplate.class })
@ComponentScan(excludeFilters = @Filter(type = FilterType.REGEX, pattern = "io.mosip.idrepository.core.*"), basePackages = {
		"io.mosip.*" })
public class BioExtractorApplication {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(BioExtractorApplication.class, args);
	}

}