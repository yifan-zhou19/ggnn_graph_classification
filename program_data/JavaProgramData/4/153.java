package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int k;
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (b > a)
		{
			for (k = 0;k < a;k++)
			{
			i = 0;
			j = k;
			while (i <= k)
			{
			System.out.printf("%d\n",c[i][j]);
			i = i + 1;
			j = j - 1;
			}
			}
		for (k = 0;k < b - a;k++)
		{
			i = 0;
		j = a + k;
		while (i <= a - 1)
		{
			System.out.printf("%d\n",c[i][j]);
			i++;
			j--;
		}
		}
		for (k = 0;k < a - 1;k++)
		{
			i = k + 1;
		j = b - 1;
		while (i <= a - 1)
		{
			System.out.printf("%d\n",c[i][j]);
			i++;
			j--;
		}
		}
		}
		else if (b < a)
		{
			for (k = 0;k < b;k++)
			{
			i = 0;
			j = k;
			while (j >= 0)
			{
			System.out.printf("%d\n",c[i][j]);
			i = i + 1;
			j = j - 1;
			}
			}
				for (k = 0;k < a - b;k++)
				{
			i = k + 1;
		j = b - 1;
		while (j >= 0)
		{
			System.out.printf("%d\n",c[i][j]);
			i++;
			j--;
		}
				}
				for (k = 0;k < b - 1;k++)
				{
			i = a - b + 1 + k;
		j = b - 1;
		while (i <= a - 1)
		{
			System.out.printf("%d\n",c[i][j]);
			i++;
			j--;
		}
				}
		}
		else
		{
		for (k = 0;k < a;k++)
		{
			i = 0;
			j = k;
			while (i <= k)
			{
			System.out.printf("%d\n",c[i][j]);
			i = i + 1;
			j = j - 1;
			}
		}
		for (k = 0;k < a - 1;k++)
		{
			i = k + 1;
		j = b - 1;
		while (i <= a - 1)
		{
			System.out.printf("%d\n",c[i][j]);
			i++;
			j--;
		}
		}
		}
	}
}

