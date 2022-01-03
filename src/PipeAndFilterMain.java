package src;

public class PipeAndFilterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// first stage of pipeline
		Filter f1 = new Filter1();
		
		// second stage of pipeline
		Filter f2 = new Filter2();
		
		// revised second stage
		Filter f2a = new Filter2a();
		
		// third stage of pipeline
		Filter f3 = new Filter3();
		
		// create (empty) string variables
		String start = null;
		String first_middle = null;
		String second_middle = null;
		String end = null;
		
		start = "initial string: ";
		first_middle = f1.Action(start);
		second_middle = f2.Action(first_middle);
		end = f3.Action(second_middle);
		
		System.out.println(end);
		
		// illustrate replacing Filter2 without
		// the need to change anything else
		start = "initial string: ";
		first_middle = f1.Action(start);
		second_middle = f2a.Action(first_middle);
		end = f3.Action(second_middle);
		
		System.out.println(end);
		
	}

}
