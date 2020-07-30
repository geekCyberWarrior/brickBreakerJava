public class Animate implements Runnable{
	BlockBreakerPanel b;
	public Animate(BlockBreakerPanel b) {
		this.b = b;
		
	}
	
	@Override
	public void run() {
		while(true) {
			b.update();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
