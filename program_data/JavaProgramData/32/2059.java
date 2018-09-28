package <missing>;

public class GlobalMembers
{
	public static int yu(char y)
	{
		int b;
		if (y == '0')
		{
			b = 0;
		}
		if (y == '1')
		{
			b = 1;
		}
		if (y == '2')
		{
			b = 2;
		}
		if (y == '3')
		{
			b = 3;
		}
		if (y == '4')
		{
			b = 4;
		}
		if (y == '5')
		{
			b = 5;
		}
		if (y == '6')
		{
			b = 6;
		}
		if (y == '7')
		{
			b = 7;
		}
		if (y == '8')
		{
			b = 8;
		}
		if (y == '9')
		{
			b = 9;
		}
		return (b);
	}
	public static void Main()
	{
		char[][] a = new char[20][103];
		char[][] b = new char[20][103];
		int i;
		int j;
		int k;
		int n;
		int[] c = new int[20];
		int[] d = new int[20];
		int[][] e = new int[20][103];
		int[][] f = new int[20][103];
		int m;
		{
			for (i = 0;i < 20;i++)
			{
			for (j = 0;j < 103;j++)
			{
			a[i][j] = '\0';
			b[i][j] = '\0';
			}
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			System.out.print("\n");
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
			System.out.print("\n\n");
		}
		{
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < (c[i] = String.valueOf(a[i]).length());j++)
			{
				e[i][j] = yu(a[i][j]);
			}
		 for (j = 0;j < (d[i] = String.valueOf(b[i]).length());j++)
		 {
			 f[i][j] = yu(b[i][j]);
		 }
			}
	}
		for (i = 0;i < n;i++)
		{
			for (j = (c[i] - 1);j >= (c[i] - d[i]);j--)
			{
				k = (j - c[i] + d[i]);
			if (e[i][j] > f[i][k])
			{
				e[i][j] = (e[i][j] - f[i][k]);
			}
			else if (e[i][j] == f[i][k])
			{
				e[i][j] = 0;
			}
			else if (e[i][j] < f[i][k])
			{
				e[i][j] = (e[i][j] + 10 - f[i][k]);
				{
				for (m = (j - 1);e[i][m] == 0;m--)
				{
					e[i][m] = 9;
				}
				}
								   e[i][m] = (e[i][m] - 1);
			}
			}
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			while (e[i][j] == 0)
			{
				j++;
			}
			for (;j < c[i];j++)
			{
				System.out.printf("%d",e[i][j]);
			}
			System.out.print("\n");
		}
	}

}

