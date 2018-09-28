package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s;
		String ch = new String(new char[101]);
		char c;
		int i;
		s = ch;
		ch = new Scanner(System.in).nextLine();
		for (i = 0;i < ch.length() - 1;i++)
		{
			   c = (s.Substring(i)) + *(s.Substring(i) + 1);
			   System.out.printf("%c",c);
		}
		c = s + *(s + ch.length() - 1);
		System.out.printf("%c",c);
		 return 0;
	}



}
