package lambda.observer.pattern;
/**
 * The observer pattern is another behavioral pattern that can be improved 
 * and simplified through the use of lambda expressions. 
 * In the observer pattern, an object, called the subject, 
 * maintains a list of other objects, which are its observers. 
 * When the state of the subject changes, its observers are notified. 
 * It is heavily used in MVC-based GUI toolkits in order to allow view components 
 * to be updated when state changes in the model without coupling the two classes together.
 */
public class Main {
	public static void main(String[] args) {
		Moon moon = new Moon();
		
		moon.startSpying(name -> {
			if (name.contains("Apollo")){
			        System.out.println(name + " > We made it!");
			}
		});
		
		moon.startSpying(name -> {
			if (name.contains("Apollo")){
				System.out.println(name +" > They're distracted, lets invade earth!");
			}
		});
		moon.land("An asteroid"); // not call
		moon.land("Apollo 11"); //   called
	}
}
