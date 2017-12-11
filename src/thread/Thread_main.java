package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_run[] th = new Thread_run[5];
		Thread_runnable[] th2 = new Thread_runnable[5];
		for(int i = 0; i<=th.length;i++) {			
			th[i].start();
			try {
				th[i].join();
			}catch(InterruptedException e) {
				// TODO Auto-generated catch black
				e.printStackTrace();
			}
		}
		for(int i = 0;i<th2.length;i++) {
			th2[i].run();
		}
		
/*public interface Runnable(){
	public void run();
	}
*/
		for(int i=0; i<10;i++) {
			System.out.println("main‚©‚ço—Í:"+i);
		}

	}

}
