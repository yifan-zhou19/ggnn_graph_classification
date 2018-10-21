package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d;
		int k;
		int m;
		d = 0;
		k = 0;
		char[][] g = new char[1000][6];
		String r = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			r = tempVar2.charAt(0);
		}
		m = r.length();
		for (i = 0;i < m;i++)
		{
			g[i][5] = 1;
			for (j = 0;j < n;j++)
			{
			   g[i][j] = r.charAt(i + j);
			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (strcmp(g[i],g[j]) == 0)
				{
				g[i][5]++;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			   if (g[i][5] > d)
			   {
			   d = g[i][5];
			   }
		}
	if (d > 1)
	{
		System.out.printf("%d\n",d);
		for (i = 0;i < m;i++)
		{
		   if (g[i][5] == d)
		   {
		   System.out.printf("%s\n",g[i]);
		   }
		}
	}
	else
	{
	System.out.print("NO");
	}
		return 0;
	}

}

