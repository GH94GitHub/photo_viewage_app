package com.tony.photoviewage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PhotoViewageApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoViewageApplication.class, args);
	}

	@GetMapping()
	public String hello() {
		return "(:(:(:(: Updated :):):):)";
	}
	
	@GetMapping("image")
	public String imagesDefault() {
		return "Images directory";
	}
}
