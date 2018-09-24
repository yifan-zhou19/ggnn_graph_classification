package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int u = 1;u <= n;u++)
		{
			String c = new String(new char[10010]);
			int len;
			int ok;
			int y = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			len = c.length();
			for (int i = 0;i < len;i++)
			{
				ok = 0;
				for (int j = 0;j < len;j++)
				{
					if (i == j)
					{
						continue;
					}
					else if (c.charAt(i) == c.charAt(j))
					{
						ok = 1;
					}

				}
				if (ok == 0)
				{
					System.out.printf("%c\n\n",c.charAt(i));
					y = 0;
					break;
				}
			}
			if (y != 0)
			{
				System.out.print("no\n\n");
			}
		}

	}
}

