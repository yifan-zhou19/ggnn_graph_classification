package <missing>;

public class GlobalMembers
{
	// lp.cpp : Defines the entry point for the console application.
	//
	// ??????.cpp : Defines the entry point for the console application.
	//

	public static int Main()
	{
		int n;
		int i;
		int j;
		int len = 0;
		char[][] s = new char[1000][100];
		String p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			s[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		System.out.print(s[0]);
		len = String.valueOf(s[0]).length();
		for (i = 1;i < n;i++)
		{
			if (len + String.valueOf(s[i]).length() + 1 <= 80)
			{
				p = s[i];
				System.out.print(' ');
				System.out.print(p);
				len += String.valueOf(s[i]).length() + 1;
			}
			else
			{
				p = s[i];
				System.out.print("\n");
				System.out.print(p);
				len = String.valueOf(s[i]).length();
			}
		}
		return 0;
	}


}

