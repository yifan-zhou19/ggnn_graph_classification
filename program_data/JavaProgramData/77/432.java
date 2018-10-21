package <missing>;

public class GlobalMembers
{
	/*
	 * file    homework 14_2
	 * author  ??
	 * date    2010-1-1
	 * description
	           ???????????
	*/



	public static int Match(int n, String a, char boy, char girl)
	{
		int m;
		if (a[n].equals(girl))
		{
			return n;
		}
		m = Match(n + 1, a, boy, girl);
		System.out.print(n);
		System.out.print(" ");
		System.out.print(m);
		System.out.print("\n");
		if (!a[m + 1].equals('\0'))
		{
			return Match(m + 1, a, boy, girl);
		}
		else
		{
			return 0;
		}

	}

	public static int Main()
	{
		int len;
		String a = new String(new char[100]);
		char boy;
		char girl;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		boy = a.charAt(0);
		girl = a.charAt(len - 1);
		Match(0, a, boy, girl);

		return 0;
	}

}

