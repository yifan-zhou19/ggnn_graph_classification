package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int[] k = new int[600];
		int j;
		int l;
		int n;
		int m;
		int[] d = new int[600];
		int dmax = 0;
		char[][] a = new char[600][7];
		String c = new String(new char[600]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		m = c.length();
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = c.charAt(i + j);
			}
			a[i][n] = '\0';
		}
		for (i = 0;i < m - n;i++)
		{
			for (j = i + 1;j <= m - n;j++)
			{
		 if (strcmp(a[i],a[j]) == 0)
		 {
			 d[i]++;
		 }
			}
		}
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j <= m - n;j++)
			{
				if (d[i] >= d[j])
				{
					k[i]++;
				}
			}
		}
		for (i = 0;i <= m - n;i++)
		{
			if (k[i] == m - n + 1)
			{
			break;
			}
		}
		if (d[i] == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",d[i] + 1);
			for (i = 0;i <= m - n;i++)
			{
				if (k[i] == m - n + 1)
				{
					System.out.printf("%s\n",a[i]);
				}
			}


		}





	}
}

