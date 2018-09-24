package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		int i;
		int j;
		int k;
		int l;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		n = c.length();
		k = 0;
		for (i = 65;i < 91;i++)
		{
			l = 0;
			for (j = 0;j < n;j++)
			{
				if (c.charAt(j) == i)
				{
					l = l + 1;
				}
			}
			if (l == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%c=%d\n",i,l);
				k = k + 1;
			}
		}

	for (i = 97;i < 123;i++)
	{
			l = 0;
			for (j = 0;j < n;j++)
			{
				if (c.charAt(j) == i)
				{
					l = l + 1;
				}
			}
			if (l == 0)
			{
				continue;
			}
			else
			{
				System.out.printf("%c=%d\n",i,l);
				k = k + 1;
			}
	}
		if (k == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

