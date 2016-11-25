package com.java.controlflow;

public class While_Loop {

	public static void main(String[] args) {
		
		boolean connected = false;
		long now = System.currentTimeMillis();
		long oneMinFromStart = System.currentTimeMillis() + 6000;
		while(!connected && now < oneMinFromStart){
			System.out.println("Trying to connect...........");
			if(MailServer.connect()){
				connected = true;
				break;
			}
			
			try{
				System.out.println("Letting other processes run");
				Thread.sleep(2000);
			}catch(Exception e){
				e.printStackTrace();
			}
			now = System.currentTimeMillis();
		}
		if(connected){
			System.out.println("Connected to mail server");
		}else{
			System.out.println("Time out while trying to connect to mail server");
		}
	}

}
