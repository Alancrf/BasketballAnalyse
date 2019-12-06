package view;

import java.io.IOException;

import controller.ReadFiles;

public class View {

	public static void main(String[] args) throws IOException {
		
		ReadFiles rf =  new ReadFiles();
		
		// 
		String homePlayer = "/home/alanoliveira/Área de Trabalho/analyse/basketball/home";
		String awayPlayer = "/home/alanoliveira/Área de Trabalho/analyse/basketball/away";
		
		
		rf.readPlayers(homePlayer,awayPlayer);
		
	}

}
