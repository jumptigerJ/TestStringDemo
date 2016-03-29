
public class StringBufferDemo02 {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer();
		sbf.append("HELLO");
		sbf.insert(0, "miss you");
		System.out.println(sbf.toString());
		sbf.replace(2, 4, "dafad");
		System.out.println(sbf.toString());

	}

}
