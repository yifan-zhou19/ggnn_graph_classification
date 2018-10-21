package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sh(char c[32]);
		int n;
		int i;
		String c = new String(new char[32]);
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
				c = tempVar2.charAt(0);
			}
			sh(c);
		}
	return 0;
	}
	public static void sh(String c)
	{
		int m;
		int j;
		m = c.length();
		if (c[m - 1].equals('y'))
		{
			for (j = 0;j < m - 2;j++)
			{
		System.out.printf("%c",c[j]);
			}
		System.out.print("\n");
		}
		else if (c[m - 1].equals('r'))
		{
			for (j = 0;j < m - 2;j++)
			{
		System.out.printf("%c",c[j]);
			}
		System.out.print("\n");
		}
		else
		{
			for (j = 0;j < m - 3;j++)
			{
		System.out.printf("%c",c[j]);
			}
		System.out.print("\n");
		}
	}
}

