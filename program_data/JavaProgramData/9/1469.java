package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		char[][] s = new char[100][11];
		String z = new String(new char[11]);
		int[] g = new int[100];
		int c;
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				g[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - i;j++)
			{
				if (g[j - 1] < g[j] && g[j] >= 60)
				{
					z = s[j - 1];
					s[j - 1] = s[j];
					s[j] = z;
					c = g[j - 1];
					g[j - 1] = g[j];
					g[j] = c;
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
		if (i == n - 1)
		{
			System.out.printf("%s",s[i]);
		}
		return 0;
	}
}

