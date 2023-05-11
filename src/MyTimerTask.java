import java.util.*;

public class MyTimerTask extends TimerTask {
	public void run () {
		System.out.println("Задание по таймеру выполняется");
	}
	
}


class Ttest {
	public static void main (String args[]) {
		MyTimerTask myTask = new MyTimerTask();
		Timer myTimer = new Timer();
		// Установить первоначальную паузу в течении одной
		// секунды, а затем повторять задание каждые полсекунды
		myTimer.schedule(myTask, 1000, 1200);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException exc) {}
		
		myTimer.cancel();
		
	}

}

