
public class StringBufferDemo01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		tell(sb);
		System.out.println(sb);

	}
	public static void tell(StringBuffer s)
	{
		s.append(","
				+ "i miss you");
	}
}
