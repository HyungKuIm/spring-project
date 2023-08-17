package com.oraclejava.learnjava.start;

public class StringClass {

	public static void main(String[] args) {
		compareReferences();
		operatorAdd();
		textBlock();

	}


	private static void textBlock() {
		System.out.println("\nText Block:");
		
		String html1 = "<html>\n"
				+ "   <body>\n"
				+ "       <p>Hello World.</p>\n"
				+ "   </body>\n"
				+ "</html>\n";
		System.out.println(html1);
		
		//Java 15부터 가능(이클립스가 지원해야 가능)
//		String html2 = """
//					<html>
//					   <body>
//					       <p>Hello World.</p>
//					   </body>
//					</html>
//				""";
//		System.out.println(html2);
	}


	private static void operatorAdd() {
		System.out.println("\nAdd strings:");
		String s1 = "abc";
		String s2 = "abc";
		String o1 = new String("abc");
		String o2 = new String("abc");
		
		String s = s1 + s2;
		System.out.println(s);
		System.out.println(s1 + "abc");
		System.out.println("abc" + "abc");
		String o = o1 + o2;
		System.out.println(o);
		System.out.println(o1 + "abc");
		
		String str = "abc";
		str = str + "def";
		System.out.println(str);
		str = str + new String("123");
		System.out.println(str);
		
		String str1 = "abc";
		String r1 = str1;
		str1 = str1 + "def";
		String r2 = str1;
		System.out.println(r1 == r2);
		System.out.println(r1.equals(r2));
	}

	private static void compareReferences() {
		System.out.println("\nCompare string references:");
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1 == s2);
		System.out.println("abc" == s1);
		
		String o1 = new String("abc");
		String o2 = new String("abc");
		System.out.println(o1 == o2);
		System.out.println("abc" == o1);
		
		System.out.println("\nCompare string references after intern:");
		System.out.println("abc" == o1.intern());
		
		System.out.println("\nCompare string spelling:");
		System.out.println(o1.equals(o2));
		System.out.println(o2.equals(o1));
		System.out.println(o1.equals("abc"));
		System.out.println("abc".equals(o1));
		System.out.println("abc".equals("abc"));
	}

}
