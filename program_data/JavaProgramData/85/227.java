package <missing>;

public class GlobalMembers
{
	public static int f(String s)
	{
		int i;
		if (!s[0].equals('_') && !(s[0].compareTo(64) > 0 && s[0].compareTo(91) < 0) && !(s[0].compareTo(96) > 0 && s[0].compareTo(123) < 0))
		{
			return 0;
		}
		for (i = 0;i < s.length();i++)
		{
			if (!s[i].equals('_') && !(s[i].compareTo(64) > 0 && s[i].compareTo(91) < 0) && !(s[i].compareTo(96) > 0 && s[i].compareTo(123) < 0) && !(s[i].compareTo('0') >= 0 && s[i].compareTo('9') <= 0))
			{
				return 0;
			}
		}
		return 1;
	}
	public static void Main()
	{
		int n;
		int i;
		char[][] str = new char[50][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (f(str[i]) != 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}

}

