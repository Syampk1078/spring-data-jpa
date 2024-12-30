package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		
		Player player = new Player();
		player.setPlayerId(101);
		player.setPlayerName("Syam");
		player.setPlayerAge(24);
		player.setLocation("Vizianagaram");
		
		PlayerRepository repo = context.getBean(PlayerRepository.class);
		repo.save(player); //upsert method
		
	}

}
