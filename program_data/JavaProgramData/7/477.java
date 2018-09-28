package <missing>;

public class GlobalMembers
{
	public static String strrpl(tangible.RefObject<String> src, tangible.RefObject<String> sub, tangible.RefObject<String> rpl)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char* p = strstr(src, sub);
	char p = tangible.StringFunctions.strStr(src.argValue, sub.argValue);
	int a;
	int b;
	if (p == null)
	{
	return src.argValue;
	}
	a = sub.argValue.length();
	b = rpl.argValue.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memmove' has no equivalent in Java:
	memmove(p + b, p + a, String.valueOf(p + a).length() + 1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
	memcpy(p, rpl.argValue, b);
	return src.argValue;
	}
	public static int Main()
	{
	String str = new String(new char[256]);
	String sub = new String(new char[256]);
	String rpl = new String(new char[256]);
	str = new Scanner(System.in).nextLine();
	sub = new Scanner(System.in).nextLine();
	rpl = new Scanner(System.in).nextLine();
tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
tangible.RefObject<String> tempRef_sub = new tangible.RefObject<String>(sub);
tangible.RefObject<String> tempRef_rpl = new tangible.RefObject<String>(rpl);
	System.out.println(strrpl(tempRef_str, tempRef_sub, tempRef_rpl));
	rpl = tempRef_rpl.argValue;
	sub = tempRef_sub.argValue;
	str = tempRef_str.argValue;
	}
}

