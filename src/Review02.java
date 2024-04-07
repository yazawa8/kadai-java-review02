public class Review02 {
    public static void main(String[] args) {
        // 1から100までの整数を順番にチェックして条件に応じて出力
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // 3で割り切れ、かつ5で割り切れる場合
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                // 3で割り切れる場合
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                // 5で割り切れる場合
                System.out.println("Buzz");
            } else {
                // その他の場合
                System.out.println(i);
            }
        }
    }
}
