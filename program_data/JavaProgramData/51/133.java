package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[502]);
		char[][] b = new char[500][6];
		int i;
		int j;
		int l;
		int m;
		int n;
		int k = 0;
		int[] c = new int[500];
		int max = 1;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		m = l - n + 1;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][j] = '\0';
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (a.charAt(j + k) != b[i][k])
					{
						break;
					}
				}
				if (k == n)
				{
					c[i]++;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (j == i)
				{
					continue;
				}
				if (strcmp(b[i],b[j]) == 0)
				{
					b[j][0] = '\0';
					c[j] = 0;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (c[i] >= max)
			{
				max = c[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
		for (i = 0;i < m;i++)
		{
			if (c[i] == max)
			{
				System.out.printf("%s\n",b[i]);
			}
		}
		}
	}


}

