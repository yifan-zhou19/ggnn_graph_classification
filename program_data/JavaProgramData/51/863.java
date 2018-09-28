package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		int[] b = new int[500];
		int s;
		int m;
		String str = new String(new char[500]);
		char[][] c = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		m = str.length();
		for (i = 0;i < m - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				c[i][j] = str.charAt(i + j);
			}
			c[i][n] = '\0';
		}
		for (i = 0;i < m - n + 1;i++)
		{
			if (b[i] == 0)
			{
				s = 0;
				for (j = i;j < m - n + 1;j++)
				{
					if (strcmp(c[i],c[j]) == 0)
					{
						s = s + 1;
						b[j] = s;
						b[i] = s + 1;
					}
					if (s > max)
					{
						max = s;
					}
				}
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < m - n + 1;i++)
			{
				if (b[i] == max + 1)
				{
					System.out.printf("%s\n",c[i]);
				}
			}
		}
		return 0;
	}

}

