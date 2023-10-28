package practise1;

public class Frequent {

    public static void main(String[] args) {
        int list[] = {1, 3, 1, 2, 3, 1};
        int mostFrequent = 0;
        int maxCount = 0;

        if (list.length == 0) {
            System.out.println("The array is empty.");
        } else {
            for (int i = 0; i < list.length; i++) {
                int count = 0;
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        count++;
                    }
                }
                if (count > maxCount) {
                    maxCount = count;
                    mostFrequent = list[i];
                }
            }

            System.out.println("The most frequent number is: " + mostFrequent);
            System.out.println("Frequency: " + maxCount);
        }
    }
}
