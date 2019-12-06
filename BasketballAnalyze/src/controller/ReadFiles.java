package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import model.AwayPlayer;
import model.HomePlayer;

public class ReadFiles {

	ArrayList<String> listLineHome = new ArrayList();
	ArrayList<String> listLineAway = new ArrayList();
	ArrayList<String> listStatistics = new ArrayList();

	public void readPlayers(String homePlayer, String awayPlayer) throws IOException {
		HomePlayer hp = new HomePlayer();
		AwayPlayer ap = new AwayPlayer();
		int scoreHome = 0, scoreAway = 0;
		int scoreHomeDefense = 0, scoreHomeOffensive = 0;
		int scoreAwayDefense = 0, scoreAwayOffensive = 0;
		
//Lendo Os dois arquivos de textos com as estatisticas dos jogadores

		FileInputStream streamHome = new FileInputStream(homePlayer);
		FileInputStream streamAway = new FileInputStream(awayPlayer);
		InputStreamReader readerHome = new InputStreamReader(streamHome);
		InputStreamReader readerAway = new InputStreamReader(streamAway);
		BufferedReader brHome = new BufferedReader(readerHome);
		BufferedReader brAway = new BufferedReader(readerAway);
		String linhaHome = brHome.readLine();
		String linhaAway = brAway.readLine();

		// Adicionando na lista do Home
		while (linhaHome != null) {
			int i = 0;
			i = i++;
			listLineHome.add(linhaHome);
			linhaHome = brHome.readLine();
		}
//Adicionando na lista do Away
		while (linhaAway != null) {
			int i = 0;
			i = i++;
//System.out.println(linhaHome);

			listLineAway.add(linhaAway);

			linhaAway = brAway.readLine();
//listLine.add(linhaHome);
		}

//Setando as pontuações dos players Home

		hp.setNamePlayer(listLineHome.get(0));
		hp.setScore(Float.parseFloat(listLineHome.get(1)));
		hp.setRightTwoPoints(Float.parseFloat(listLineHome.get(2)));
		hp.setTriedTwoScore(Float.parseFloat(listLineHome.get(3)));
		hp.setPercentageTwoPoints(Float.parseFloat(listLineHome.get(4)));
		hp.setRightThreePoints(Float.parseFloat(listLineHome.get(5)));
		hp.setTriedThreeScore(Float.parseFloat(listLineHome.get(6)));
		hp.setPercentageThreePoints(Float.parseFloat(listLineHome.get(7)));
		hp.setFreeThrow(Float.parseFloat(listLineHome.get(10)));
		hp.setOffensiveRebound(Float.parseFloat(listLineHome.get(11)));
		hp.setDefensiveRebound(Float.parseFloat(listLineHome.get(12)));
		hp.setAssistance(Float.parseFloat(listLineHome.get(14)));
		hp.setErrors(Float.parseFloat(listLineHome.get(15)));
		hp.setStealOfBall(Float.parseFloat(listLineHome.get(16)));
		hp.setBlock(Float.parseFloat(listLineHome.get(17)));

//Setando as pontuações dos players Away

		ap.setNamePlayer(listLineAway.get(0));
		ap.setScore(Float.parseFloat(listLineAway.get(1)));
		ap.setRightTwoPoints(Float.parseFloat(listLineAway.get(2)));
		ap.setTriedTwoScore(Float.parseFloat(listLineAway.get(3)));
		ap.setPercentageTwoPoints(Float.parseFloat(listLineAway.get(4)));
		ap.setRightThreePoints(Float.parseFloat(listLineAway.get(5)));
		ap.setTriedThreeScore(Float.parseFloat(listLineAway.get(6)));
		ap.setPercentageThreePoints(Float.parseFloat(listLineAway.get(7)));
		ap.setFreeThrow(Float.parseFloat(listLineAway.get(10)));
		ap.setOffensiveRebound(Float.parseFloat(listLineAway.get(11)));
		ap.setDefensiveRebound(Float.parseFloat(listLineAway.get(12)));
		ap.setAssistance(Float.parseFloat(listLineAway.get(14)));
		ap.setErrors(Float.parseFloat(listLineAway.get(15)));
		ap.setStealOfBall(Float.parseFloat(listLineAway.get(16)));
		ap.setBlock(Float.parseFloat(listLineAway.get(17)));

		listStatistics.add(""); // 0
		listStatistics.add("PTS");// 1
		listStatistics.add("Acertos 2 Pontos");// 2
		listStatistics.add("Tentativas 2 Pontos");// 3
		listStatistics.add("Aproveitamento 2 pontos");// 4
		listStatistics.add("Acertos 3 Pontos");// 5
		listStatistics.add("Tentativa 3 pontos");// 6
		listStatistics.add("Aproveitamento 3 pontos");// 7
		listStatistics.add("");// 8
		listStatistics.add("");// 9
		listStatistics.add("Lance Livre Aproveitamento");// 10
		listStatistics.add("Rebote Ofensivo");// 11
		listStatistics.add("Rebote Defensivo");// 12
		listStatistics.add("");// 13
		listStatistics.add("Assistência");// 14
		listStatistics.add("Erros");// 15
		listStatistics.add("Roubo de bola");// 16
		listStatistics.add("Toco");// 17
		listStatistics.add("");// 18

		if (hp.getScore() > ap.getScore()) {
			scoreHome = scoreHome + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
		} else if (ap.getScore() > hp.getScore()) {
			scoreAway = scoreAway + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		}

		if (hp.getPercentageTwoPoints() > ap.getPercentageTwoPoints()) {
			scoreHome = scoreHome + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
		} else if (ap.getPercentageTwoPoints() > hp.getPercentageTwoPoints()) {
			scoreAway = scoreAway + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		}

		if (hp.getPercentageThreePoints() > ap.getPercentageThreePoints()) {
			scoreHome = scoreHome + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
		} else if (ap.getPercentageThreePoints() > hp.getPercentageThreePoints()) {
			scoreAway = scoreAway + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		}

		if (hp.getFreeThrow() > ap.getFreeThrow()) {
			scoreHome = scoreHome + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
		} else if (ap.getFreeThrow() > hp.getFreeThrow()) {
			scoreAway = scoreAway + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		}

		if (hp.getDefensiveRebound() > ap.getDefensiveRebound()) {
			scoreHome = scoreHome + 1;
			scoreHomeDefense = scoreHomeDefense + 1;
		} else if (ap.getDefensiveRebound() > hp.getDefensiveRebound()) {
			scoreAway = scoreAway + 1;
			scoreAwayDefense = scoreAwayDefense + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
			scoreHomeDefense = scoreHomeDefense + 1;
			scoreAwayDefense = scoreAwayDefense + 1;
		}

		if (hp.getOffensiveRebound() > ap.getOffensiveRebound()) {
			scoreHome = scoreHome + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
		} else if (ap.getOffensiveRebound() > hp.getOffensiveRebound()) {
			scoreAwayOffensive = scoreAwayOffensive + 1;
			scoreAway = scoreAway + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		}

		if (hp.getAssistance() > ap.getAssistance()) {
			scoreHome = scoreHome + 1;
			scoreHomeOffensive = scoreHomeOffensive + 1;
		} else if (ap.getAssistance() > hp.getAssistance()) {
			scoreAway = scoreAway + 1;
			scoreAwayOffensive = scoreAwayOffensive + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
		}

		if (hp.getStealOfBall() > ap.getStealOfBall()) {
			scoreHome = scoreHome + 1;
			scoreHomeDefense = scoreHomeDefense + 1;
		} else if (ap.getStealOfBall() > hp.getStealOfBall()) {
			scoreAway = scoreAway + 1;
			scoreAwayDefense = scoreAwayDefense + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
			scoreHomeDefense = scoreHomeDefense + 1;
			scoreAwayDefense = scoreAwayDefense + 1;
		}

		if (hp.getBlock() > ap.getBlock()) {
			scoreHome = scoreHome + 1;
			scoreHomeDefense = scoreHomeDefense + 1;
		} else if (ap.getBlock() > hp.getBlock()) {
			scoreAway = scoreAway + 1;
			scoreAwayDefense = scoreAwayDefense + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;
			scoreHomeDefense = scoreHomeDefense + 1;
			scoreAwayDefense = scoreAwayDefense + 1;
		}

		if (hp.getErrors() < ap.getErrors()) {
			scoreHome = scoreHome + 1;
		} else if (ap.getErrors() < hp.getErrors()) {
			scoreAway = scoreAway + 1;
		} else {
			scoreHome = scoreHome + 1;
			scoreAway = scoreAway + 1;

		}

		if (scoreHome > scoreAway) {
			System.out.println("O " + hp.getNamePlayer() + " foi o vencedor do Duelo");
		} else if (scoreHome < scoreAway) {
			System.out.println("O " + ap.getNamePlayer() + " foi o vencedor do Duelo");
		} else {
			System.out.println("Deu empate");
		}

		System.out.println("");

		if (scoreHomeDefense > scoreAwayDefense) {
			System.out.println("O " + hp.getNamePlayer() + " foi melhor na defesa");
		} else if (scoreHomeDefense < scoreAwayDefense) {
			System.out.println("O " + ap.getNamePlayer() + " foi melhor na defesa");
		} else {
			System.out.println("Deu empate");
		}

		System.out.println("");

		System.out.println("Pontos defensivo do " + hp.getNamePlayer() + ": " + scoreHomeDefense);
		System.out.println("Pontos defensivo do " + ap.getNamePlayer() + ": " + scoreAwayDefense);

		System.out.println("");

		if (scoreHomeOffensive > scoreAwayOffensive) {
			System.out.println("O " + hp.getNamePlayer() + " foi melhor no ataque");
		} else if (scoreHomeOffensive < scoreAwayOffensive) {
			System.out.println("O " + ap.getNamePlayer() + " foi melhor no ataque");
		} else {
			System.out.println("Deu empate");
		}

		System.out.println("");

		System.out.println("Pontos ofensivos do " + hp.getNamePlayer() + ": " + scoreHomeOffensive);
		System.out.println("Pontos ofensivos do " + ap.getNamePlayer() + ": " + scoreAwayOffensive);

		System.out.println("");

		System.out.println("Dados Home \n");
		for (int index = 0; listLineHome.size() > index; index++) {

			if(index == 8 || index == 9 || index == 13 || index == 18) {
				continue;
			}
		
			System.out.println(listStatistics.get(index) + " " + listLineHome.get(index));

		}
		System.out.println("");
		System.out.println("Dados Away \n");
		for (int index = 0; listLineAway.size() > index; index++) {

			if(index == 8 || index == 9 || index == 13 || index == 18) {
				continue;
			}
			
			System.out.println(listStatistics.get(index) + " " + listLineAway.get(index));
		}
		
		System.out.println("");
		System.out.println("");
			//imprimindo apenas os dados home
		for (int index = 0; listLineHome.size() > index; index++) {

			if(index == 8 || index == 9 || index == 13 || index == 18) {
				continue;
			}
		
			System.out.println(listLineHome.get(index));
		}
		
		System.out.println("");
		System.out.println("");
		//imprimindo apenas os dados away
		for (int index = 0; listLineAway.size() > index; index++) {

			if(index == 8 || index == 9 || index == 13 || index == 18) {
				continue;
			}
		
			System.out.println(listLineAway.get(index));

		}
		
		

	}
	
	public void savePlanilha(String file) {
		
	
		
	}

}