package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
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
			m = c.length();
			if (c.charAt(m - 1) == 'y')
			{
				for (j = 0;j < m - 2;j++)
				{
			System.out.printf("%c",c.charAt(j));
				}
			System.out.print("\n");
			}
			else if (c.charAt(m - 1) == 'r')
			{
				for (j = 0;j < m - 2;j++)
				{
			System.out.printf("%c",c.charAt(j));
				}
			System.out.print("\n");
			}
			else
			{
				for (j = 0;j < m - 3;j++)
				{
			System.out.printf("%c",c.charAt(j));
				}
			System.out.print("\n");
			}
		}
	return 0;
	}
}

