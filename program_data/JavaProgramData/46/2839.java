package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[2000][2000];

	public static void print(int h,int l)
	{
		int i;
		int j;
		for (j = 0;j < l;j++)
		{
			System.out.printf("%d\n",a[0][j]);
		}
		for (i = 1;i < h;i++)
		{
			System.out.printf("%d\n",a[i][l - 1]);
		}
		for (j = l - 2;j >= 0;j--)
		{
			System.out.printf("%d\n",a[h - 1][j]);
		}
		for (i = h - 2;i > 0;i--)
		{
			System.out.printf("%d\n",a[i][0]);
		}
	}
	public static void gai(int h,int l)
	{
		int i;
		int j;
		for (i = 0;i < h - 1;i++)
		{
			for (j = 0;j < l - 2;j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 0;j < l - 2;j++)
		{
			for (i = 0;i < h - 2;i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}

	public static void Main()
	{
		int i;
		int j;
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (;(h > 1 && l > 1);h = h - 2, l = l - 2)
		{
			print(h, l);
			gai(h, l);
		}

		if (h == 1 && l > 1)
		{
			for (j = 0;j < l;j++)
			{
				System.out.printf("%d\n",a[0][j]);
			}
		}
		else if (l == 1 && h > 1)
		{
			for (i = 0;i < h;i++)
			{
				System.out.printf("%d\n",a[i][0]);
			}
		}
		else if (h == 1 && l == 1)
		{
			System.out.printf("%d\n",a[0][0]);
		}
	}
}

