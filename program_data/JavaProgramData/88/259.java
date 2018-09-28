package <missing>;

public class GlobalMembers
{
	// 44.cpp : Defines the entry point for the console application.
	//


	public static int Main()
	{
		String s = new String(new char[30]);
		s = new Scanner(System.in).nextLine();
		int i;
		int len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9'))
			{
				System.out.printf("%c",s.charAt(i));
			}
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && (s.charAt(i + 1) < '0' || s.charAt(i + 1)>'9'))
			{
				System.out.printf("%c\n",s.charAt(i));
			}
		}
		return 0;
	}


}
