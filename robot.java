import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.URI;


public class robot {
	public static void main(String[] args) throws AWTException{
		
		Robot robot = new Robot();

		try {
			Desktop.getDesktop().browse(new URI("회사 포탈 주소"));
		} catch (Exception e) {
			e.getMessage();
		}

		robot.delay(5000);
		robot.mouseMove(810, 325);
		robot.mousePress(InputEvent.BUTTON1_MASK); // 클릭 ID
		
		int idkey[] = new int[]{아이디 값 정의 - 아스키코드}; // id keypress
		int pwkey[] = new int[]{패스워드값 정의 - 아스키코드}; // pw keypress

		
		for(int i=0; i<idkey.length; i++){
			robot.keyPress(idkey[i]);
			robot.keyRelease(idkey[i]);
		}
		robot.mouseRelease(InputEvent.BUTTON1_MASK); // id click not
		
		robot.delay(1000);
		robot.mouseMove(950, 375); // move pw
		
		robot.mousePress(InputEvent.BUTTON1_MASK); // pw click
		for(int i=0; i<pwkey.length; i++){
			robot.keyPress(pwkey[i]);
			robot.keyRelease(pwkey[i]);
		}
		robot.mouseRelease(InputEvent.BUTTON1_MASK); // pw click not
	
		robot.delay(1000);
		robot.mouseMove(1160, 425); // LOGIN
		robot.mousePress(InputEvent.BUTTON1_MASK); // click
		robot.mouseRelease(InputEvent.BUTTON1_MASK); // click not
	
		robot.delay(5000); // delay 5sec
		robot.mouseMove(1700, 105);
		robot.mousePress(InputEvent.BUTTON1_MASK); // click
		robot.mouseRelease(InputEvent.BUTTON1_MASK); // click not
		
		robot.delay(2000);
		robot.mouseMove(1870, 525);
			
		// 출근 클릭 이벤트
		}
}