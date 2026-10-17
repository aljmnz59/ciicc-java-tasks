public class SumOfParameters {
    public static void main(String[] args) {

        int result = sumOfParameters(5);

        System.out.println("The sum of all parameters w/ subsequent params is: " + result);

    }

    public static int sumOfParameters(int... nums){
        int totalParam = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j <= nums[i]; j++){
                totalParam += j;
            }
        }
        return totalParam;
    }

}