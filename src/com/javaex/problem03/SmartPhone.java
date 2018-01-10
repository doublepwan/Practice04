package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
    	 if("앱".equals(str)){
    		 playAPP();
         }else{
        	 super.execute(str);
         }
    	
        
    }

	private void playAPP() {
		System.out.println("앱 실행");
		
	}
	
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
 
    //메소드작성
    
    //메소드작성
    
    
    
}
