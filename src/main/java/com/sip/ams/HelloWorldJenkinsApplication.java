package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.ams.util.Calcul;

@SpringBootApplication
public class HelloWorldJenkinsApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(HelloWorldJenkinsApplication.class, args);
		System.out.println("Jenkins with github");
		
		Calcul c = new Calcul();
		
		//int res = c.somme(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		int res = c.somme(10, 4);
		System.out.println("Le result est :"+ res);
		
	}

}
