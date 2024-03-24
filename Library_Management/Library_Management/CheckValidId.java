package Library_Management;
//Java code to return count of valid registration numbers according to SGGS format
class Correct_reg {
    public static void main(String[] args) {
        
    }

    public static boolean check_reg(String[] args) {
        //int count = 0;

        for (String registration : args) {
            if (registration.length() != 10) {
                continue;
            }

            boolean are_initial_4_digit = true;
            boolean are_middle_3_word = true;
            boolean are_last_3_digit = true;

            for (int j = 0; j < 10; j++) {
                if (j < 4 && !Character.isDigit(registration.charAt(j))) {
                    are_initial_4_digit = false;
                    break;
                }

                if (j > 3 && j < 7) {
                    if (!branch_check(registration.substring(4, 7))) {
                        are_middle_3_word = false;
                        break;
                    }
                }

                if (j > 6 && !Character.isDigit(registration.charAt(j))) {
                    are_last_3_digit = false;
                    break;
                }
            }

            if (are_initial_4_digit && are_middle_3_word && are_last_3_digit) {
                return true;
                
            }else{
            	
            	return false;}
        }
        return false;
        }

        

       
    

    private static boolean branch_check(String string) {
        String[] branches = {"bit", "bec", "bpd", "bel", "bcs"};
        for (String branch : branches) {
            if (string.equals(branch)) {
                return true;
            }
        }
        return false;
    }}


		
	
	
	
		
	
