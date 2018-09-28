package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		String c = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		m = c.length();
		for (i = 2;i < m;i++)
		{
			for (j = 0;j + i < m + 1;j++)
			{
				for (k = 0,n = 0;k < i;k++)
				{
					if (c.charAt(j + k) != c.charAt(j + i - k - 1))
					{
						n++;
					}
				}
				if (n == 0)
				{
					for (k = 0;k < i;k++)
					{
						System.out.printf("%c",c.charAt(j + k));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

