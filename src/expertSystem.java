import java.util.Scanner;

public class expertSystem {

	static Scanner kb = new Scanner(System.in);
	static int i = 1;
	
	
	public static void main(String[] args) {
		
		QuestionNode q1 = new QuestionNode("Is it a fast food restaurant?");
		QuestionNode q2 = new QuestionNode("Is there a clown mascot?");
		QuestionNode q4 = new QuestionNode("McDonald's");
		QuestionNode q5 = new QuestionNode("Does it serve burgers?");
		QuestionNode q6 = new QuestionNode("Does the mascot have red hair?");
		QuestionNode q7 = new QuestionNode("Wendy's");
		QuestionNode q8 = new QuestionNode("Is King in the name?");
		QuestionNode q9 = new QuestionNode("Burger King");
		QuestionNode q10 = new QuestionNode("Is it known for its drinks?");
		QuestionNode q11 = new QuestionNode("Is it specific to CMU?");
		QuestionNode q12 = new QuestionNode("Jon's Drive-In");
		QuestionNode q13 = new QuestionNode("Down Under Food Court");
		QuestionNode q14 = new QuestionNode("Known for it's Checkered Flags?");
		QuestionNode q15 = new QuestionNode("Rally's");
		QuestionNode q16 = new QuestionNode("Known for its Orange Juice?");
		QuestionNode q17 = new QuestionNode("Orange Julius");
		QuestionNode q18 = new QuestionNode("Is it Culver's?");
		QuestionNode q19 = new QuestionNode("Go to Culver's!");
		QuestionNode q20 = new QuestionNode("It's Big Boy");
		QuestionNode q21 = new QuestionNode("Is it Chinese?");
		QuestionNode q22 = new QuestionNode("Dragon Express");
		QuestionNode q23 = new QuestionNode("Does it serve subs?");
		QuestionNode q24 = new QuestionNode("Is it Subway?");
		QuestionNode q25 = new QuestionNode("Subway");
		QuestionNode q26 = new QuestionNode("Firehouse");
		QuestionNode q27 = new QuestionNode("Are they known for roast beef?");
		QuestionNode q28 = new QuestionNode("Arby's");
		QuestionNode q29 = new QuestionNode("Are they known for chicken?");
		QuestionNode q30 = new QuestionNode("KFC");
		QuestionNode q31 = new QuestionNode("Taco Bell");
		QuestionNode q32 = new QuestionNode("Max and Emily's");
		
		
		q4.is_end_node = true;
		q7.is_end_node = true;
		q9.is_end_node = true;
		q12.is_end_node = true;
		q13.is_end_node = true;
		q15.is_end_node = true;
		q17.is_end_node = true;
		q19.is_end_node = true;
		q20.is_end_node = true;
		q22.is_end_node = true;
		q25.is_end_node = true;
		q26.is_end_node = true;
		q28.is_end_node = true;
		q30.is_end_node = true;
		q31.is_end_node = true;
		q32.is_end_node = true;
		
		q1.yes_node = q2;
		q1.no_node = q32;
		q2.yes_node = q4;
		q2.no_node = q5;
		q5.yes_node = q6;
		q5.no_node = q21;
		q6.yes_node = q7;
		q6.no_node = q8;
		q8.yes_node = q9;
		q8.no_node = q10;
		q10.yes_node = q11;
		q10.no_node = q12;
		q11.yes_node = q13;
		q11.no_node = q14;
		q14.yes_node = q15;
		q14.no_node = q16;
		q16.yes_node = q17;
		q16.no_node = q18;
		q18.yes_node = q19;
		q18.no_node = q20;
		
		q21.yes_node = q22;
		q21.no_node = q23;
//		q22.no_node = q23;
		q23.yes_node = q24;
		q23.no_node = q27;
		q24.yes_node = q25;
		q24.no_node = q26;
		q23.no_node = q27;
		q27.yes_node = q28;
		q27.no_node = q29;
		q29.yes_node = q30;
		q29.no_node = q31;
		
		beginIterate(q1);
		
	}
	
	
	public static void beginIterate(QuestionNode question_node){
		QuestionNode focus_node = question_node;
		System.out.print(i + ") ");
		System.out.print(focus_node + "\n");
		if(focus_node.is_end_node != true){
			String answer = kb.next();
			if(answer.equals("y")){
				i+=1;
				beginIterate(question_node.yes_node);
			}else{
				i+=1;
				beginIterate(question_node.no_node);
			}
		}else{
			System.exit(0);
		}
	}
	
}
