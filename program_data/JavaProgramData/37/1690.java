package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int l;
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= t;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			l = c.length();
			for (i = 0;i <= l - 1;i++)
			{
				for (j = 0;j <= l - 1;j++)
				{
					if (c.charAt(i) == c.charAt(j) && i != j)
					{
						break;
					}
				}
				if (j == l)
				{
					break;
				}
			}
			if (i == l)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.printf("%c\n",c.charAt(i));
			}
		}
		return 0;
	}
}

