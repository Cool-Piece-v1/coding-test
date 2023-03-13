package BufferedReader;

public class programers_solution {
	class Solution {
	    public int[] solution(String[] wallpaper) {

	        String arr[] = new String[wallpaper.length];
	        
	        int raw1 = 0 ; // 처음 행 시작
	        int raw2 = 0 ; // 마지막 행 시작
	 
	        // 마지막행
	        // 행에서 #이 하나라도 있으면 i 가 되도록 함 
	        for(int i = 0 ; i < wallpaper.length ; i++){
	            if(arr[i].indexOf("#") >= 1){
	                raw2 = i;
	            }
	        }
	        
	        // 처음행 
	        // 행에서 #이 하나라도 있으면 i 가 되도록 함
	        for(int i = wallpaper.length-1 ; i >= 0 ; i--){
	            if(arr[i].indexOf("#")>= 1){
	                raw1 = i;
	            }
	        }
	        
	        // 열 
	        int min = wallpaper[0].length()-1 ; // 가장 처음 나오는 #
	        int max = 0 ; // 가장 마지막에 나오는 # 
	        for(int i = 0 ; i < wallpaper[0].length() ; i++){
	              if(max < wallpaper[i].indexOf("#")){
	                  max = wallpaper[i].indexOf("#");
	              }
	          }
	        
	        for(int i = 0 ; i < wallpaper[0].length() ; i++){
	              if(min > wallpaper[i].indexOf("#")){
	                  min = wallpaper[i].indexOf("#");
	              }
	          }
	       
	        int[] answer = new int[] {raw1, min, raw2+1, max+1};
	        return answer;
	    }   
	}