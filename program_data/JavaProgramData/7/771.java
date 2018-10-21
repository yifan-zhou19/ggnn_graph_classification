package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String str = new String(new char[256]);
	 String sub = new String(new char[256]);
	 String rep = new String(new char[256]);
	 String temp = new String(new char[256]);
	 String p;
	 str = new Scanner(System.in).nextLine();
	 sub = new Scanner(System.in).nextLine();
	 rep = new Scanner(System.in).nextLine();
	 p = tangible.StringFunctions.strStr(str,sub);
	 if (p != null)
	 {
	  p = null;
	  temp = str;
	  temp += rep;
	  temp += p + sub.length();
	  str = temp;
	 }
	 System.out.printf("%s\n", str);
	 return 0;
	}
}

