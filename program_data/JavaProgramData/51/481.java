package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[600]);
		char[][] c = new char[600][7];
		int max = 0;
		int temp;
		int n;
		int m;
		int i;
		int j;
		int[] num = new int[600];
		int shu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		m = a.length();
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				c[i][j] = a.charAt(i + j);
			}
		}
		for (i = 0;i <= m - n;i++)
		{
			c[i][n] = 0;
		}
		for (i = 0;i <= m - n;i++)
		{
			for (j = i;j < m;j++)
			{
				if (strcmp(c[i],c[j]) == 0)
				{
					num[i]++;
				}
			}
		}
		for (i = 0;i <= m - n;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i <= m - n;i++)
			{
				if (num[i] == max)
				{
					shu++;
				}
			}
		}
		if (max != 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= m - n;i++)
			{
				if (num[i] == max)
				{
						System.out.println(c[i]);
						System.out.print('\n');
				}
			}
		}
	}

}

