public class QuestionNode {
	String question = "";
	Boolean is_end_node = false;
	String restaurant_name;
	
	QuestionNode yes_node;
	QuestionNode no_node;
	

	public QuestionNode(String question) {
		this.question = question;
	}

	public String toString() {
		return this.question;
	}
	
	public QuestionNode get_yes_node(){
		return this.yes_node;
	}
	public QuestionNode get_no_node(){
		return this.no_node;
	}
}

//static int AMPHIBIAN_COUNTER = 0;
//static int MAMMAL_COUNTER = 0;
//static int BIRD_COUNTER = 0;
//static int REPTILE_COUNTER = 0;
//static int FISH_COUNTER = 0;
//static int INVERTEBRATE_COUNTER = 0;
//
//Scanner kb = new Scanner(System.in);
//public static void main(String[] args) {
//	System.out.println("Welcome to the animal kingdom guessing software. Let's Begin.");
//	// TODO Auto-generated method stub
//
//	System.out.print("0) Does Your Animal have feathers, or fur?");
//	Scanner kb = new Scanner(System.in);
//	String answer = kb.next();
//	if (answer.equals("y")){
//		//mammal or bird
//		MAMMAL_COUNTER+=1;
//		BIRD_COUNTER+=1;
//	}else{
//		//Amphibian, reptile, fish, invertebrate 
//		AMPHIBIAN_COUNTER+=1;
//		REPTILE_COUNTER+=1;
//		FISH_COUNTER+=1;
//		INVERTEBRATE_COUNTER+=1;
//	}
//	
//	System.out.print("1) Does your animal spend most of it's time underwater?");
//	String answerone = kb.next();
//	if (answerone.equals("y")){
//		//mammal or bird
//		MAMMAL_COUNTER+=1;
//		AMPHIBIAN_COUNTER+=1;
//		REPTILE_COUNTER+=1;
//		FISH_COUNTER+=1;
//		INVERTEBRATE_COUNTER+=1;
//	}else{
//		BIRD_COUNTER+=1;
//		//Amphibian, reptile, fish, invertebrate 
//	}
//	
//	System.out.print("2) Does your animal walk on two legs?");
//	String answertwo = kb.next();
//	if (answertwo.equals("y")){
//		MAMMAL_COUNTER++;
//		BIRD_COUNTER++;
//	}else{
//		AMPHIBIAN_COUNTER+=1;
//		REPTILE_COUNTER+=1;
//		FISH_COUNTER+=1;
//		INVERTEBRATE_COUNTER+=1; 
//
//	}
//	
//	System.out.print("3) Is your animal cold blooded?");
//	String answerthree = kb.next();
//	if (answerthree.equals("y")){
//		AMPHIBIAN_COUNTER+=1;
//		REPTILE_COUNTER+=1;
//		FISH_COUNTER+=1;
//		INVERTEBRATE_COUNTER+=1; 
//	}else{
//		MAMMAL_COUNTER++;
//		BIRD_COUNTER++;
//	}
//
//	
//	System.out.print("4) Is your animal cold blooded?");
//	String answerfour = kb.next();
//	if (answerfour.equals("y")){
//		AMPHIBIAN_COUNTER+=1;
//		REPTILE_COUNTER+=1;
//		FISH_COUNTER+=1;
//		INVERTEBRATE_COUNTER+=1; 
//	}else{
//		MAMMAL_COUNTER++;
//		BIRD_COUNTER++;
//	}
//}