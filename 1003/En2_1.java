public class En2_1 {
	/*
	 * このプログラムは｢FizzBzz｣と呼ばれるプログラムです。
	 *
	 * 1から100までの数字に対して、もしその数が3で割り切れる場合は｢Fizz｣を、
	 * ５で割り切れる場合は｢Buzz｣を、3でも5でも割り切れる場合は｢FizzBuzz｣を、
	 * それ以外の場合はその数字を順に出力します。
	 *
	 * アルゴリズムを正確にプログラムに落とし込めるか、という基礎力を測る問題と
	 * してよく取り上げられます。
	 */
	public static void main (String[] args) {
		for(int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
