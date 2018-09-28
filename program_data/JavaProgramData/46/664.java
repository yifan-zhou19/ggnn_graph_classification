package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int r;
		int c;
		int num = 0;
		int[][] a = new int[100][100];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		k = r * c;
		for (i = 0;;i++)
		{
			for (j = i;j <= c - 1 - i;j++)
			{
				System.out.printf("%d\n",a[i][j]);
				num = num + 1;

			}
			if (num == k)
			{
					break;
			}
			for (j = i + 1;j <= r - 1 - i;j++)
			{
				System.out.printf("%d\n",a[j][c - i - 1]);
				num = num + 1;

			}
			if (num == k)
			{
					break;
			}
			for (j = c - i - 2;j >= i;j--)
			{
				System.out.printf("%d\n",a[r - 1 - i][j]);
				num = num + 1;

			}
			if (num == k)
			{
					break;
			}
			for (j = r - i - 2;j >= (i + 1);j--)
			{
				System.out.printf("%d\n",a[j][i]);
				num = num + 1;

			}
			if (num == k)
			{
					break;
			}
		}

	}

}

