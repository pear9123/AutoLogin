import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.URI;


public class robot2 {
	public static void main(String[] args) throws AWTException{
		
		Robot robot = new Robot();

		try {
			Desktop.getDesktop().browse(new URI("회사 포탈 주소"));
		} catch (Exception e) {
			e.getMessage();
		}
	
		robot.delay(5000); // delay 5sec
		robot.mouseMove(1700, 105);
		robot.mousePress(InputEvent.BUTTON1_MASK); // click
		robot.mouseRelease(InputEvent.BUTTON1_MASK); // click not
		
		robot.delay(2000);
		robot.mouseMove(1870, 575);
			
		// 클릭 이벤트
		}
}