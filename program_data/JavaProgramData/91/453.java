package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
	int p;
	int len;
	final String s = "";
	s = new Scanner(System.in).nextLine();
	len = s.length();
	p = s.charAt(0);
	for (i = 0;i < len - 1;i++)
	{
	System.out.printf("%c",*(s.Substring(i)) + *(s.Substring(i) + 1));
	}
	System.out.printf("%c",*s + *(s.Substring(len) - 1));
	}

}
