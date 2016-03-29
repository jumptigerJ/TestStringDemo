
public class StringBufferDemo03 {

	public static void main(String[] args) {
		String str = "hello";
		StringBuffer sb = new StringBuffer();
		sb.append("hey");
		for(int i = 0 ;i < 100; i++){
			str = str +i;
			sb.append(i);
		}
		System.out.println(str);
		System.out.println(sb);
		//String每次都要开辟内存，比较慢
		

	}

}
