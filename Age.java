public class Age {
    public static boolean isEligibleAge(int age) {
        if(age >= 18 && age <= 100) {
            return true;
        } else {
            return false;
        }
    }
}