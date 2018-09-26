package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[256]);
	  String sub = new String(new char[256]);
	  String rep = new String(new char[256]);
	  str = new Scanner(System.in).nextLine();
	  sub = new Scanner(System.in).nextLine();
	  rep = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char* p=strstr(str,sub);
	  char p = tangible.StringFunctions.strStr(str,sub);
	  if (p == null)
	  {
		System.out.printf("%s\n",str);
	  }
	  else
	  {
		int len = rep.length();
		int i;
		for (i = 0;i < len;i++)
		{
			p = rep.charAt(i);
		  p++;
		}
		System.out.printf("%s\n",str);
	  }
	  return 0;
	}
}

