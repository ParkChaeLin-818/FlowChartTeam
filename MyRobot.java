
/**
 * 여기에 MyRobot 클래스 설명을 작성하십시오.
 * 
 * @author (2018315010 박채린 2018315054 호즈미요시아키) 
 * @version (2020.04.08)
 */
public class MyRobot
{
    public MyRobot(){
        String ts; // ts = 교통신호 입니다.
        double s; // s = 속도 입니다.
        
        s = 10;
        
        signal(s,"red");
    }
    
    public void signal(double s , String ts){
        if(ts.equals("green")){
            s = s;
        }
        else if (ts.equals("yellow")){
            s = s * 1.2;
        }
        else{
            s = 0;
        }
        
        System.out.println(s);
    }
    
}
