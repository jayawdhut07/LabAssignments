
interface sp {
	public StringBuffer s(String str);
}

public class Exe2 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sp obj = (str) -> {
			for (int i = 0; i < str.length(); i++) {
				sb.append(str.charAt(i) + " ");
			}
			return sb;
		};
		StringBuffer str2 = obj.s("luffy");
		System.out.println(str2);
	}

}