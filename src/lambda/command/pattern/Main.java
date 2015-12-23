package lambda.command.pattern;


/**
 * Macros are just one example of how we can use the command pattern. 
 * It’s frequently used in implementing component-based GUI systems
 * , undo functions, thread pools, transactions, and wizards.
 */
public class Main {
	public static void main(String[] args) {
		
		Editor editor = new Editor(){
										@Override
										public void save() {
											System.out.println("save");
										}
										@Override
										public void open() {
											System.out.println("open");
										}
										@Override
										public void close() {
											System.out.println("close");				
										}
									};
		
		Macro macro = new Macro();
		macro.record(editor::open); 
		macro.record(editor::save); 
		macro.record(editor::close); 
		macro.run();
	}
}
