public class En4_1 {

	public static void main(String[] args) {
		Item pencilA = new Item("umi-hb-001", "umi HB", "鉛筆", 120);
		Item pencilB = new Item("umi-hb-001", "umi HB", "消しゴム", 120);
		checkEquals(pencilA, pencilB);
	}

	public static void checkEquals(Item item1, Item item2) {
		if (item1.equals(item2)) {
			System.out.println(item1.getName() + "と" + item2.getName() + "とは等しいです");
		} else {
			System.out.println(item1.getName() + "と" + item2.getName() + "とは等しくありません");
		}
	}
}
