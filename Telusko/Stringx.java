public class Stringx{
	public static void main(String[] args){
		StringBuffer strBuff = new StringBuffer("Type Shi");
		strBuff.append(" Mandem");

		String str = strBuff.toString();

		System.out.println(strBuff);
		System.out.println(strBuff.capacity());
		System.out.println(strBuff.length());
		System.out.println(str);

		strBuff.deleteCharAt(7);
		strBuff.insert(5, "Real ");
		strBuff.setLength(24);
		System.out.println(strBuff);
	}
}