package lambda.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class Moon {
	private  final List<LandingObserver> observers = new ArrayList<>();
	
	public void land(String name) {
//		for (LandingObserver observer : observers) {
//	            observer.observeLanding(name);
//	        }
		observers.stream()
				 .forEach(observer -> {
					 observer.observeLanding(name);
				 });
	}
	public void startSpying(LandingObserver observer) { 
		observers.add(observer);
	} 
}
