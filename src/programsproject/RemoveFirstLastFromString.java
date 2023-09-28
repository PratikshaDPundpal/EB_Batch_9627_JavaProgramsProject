package programsproject;

public class RemoveFirstLastFromString {

	public static void main(String[] args) {
		String input = "edubridge";
        
        if (input.length() >= 2) {
            String output = input.substring(1, input.length() - 1);
            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        } else {
            System.out.println("Input string is too short.");
        }
    }
}