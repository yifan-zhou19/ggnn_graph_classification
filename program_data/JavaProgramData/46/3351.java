package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int k;
		int sum;
		int[][] a = new int[100][100];
		int i;
		int j;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		count = 0;
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		sum = x * y;
		i = 0;
		j = 0;
		k = 0;
		while (count < sum)
		{
			for (j = 0 + k;j < y;j++)
			{
				System.out.printf("%d\n",a[i][j]);
			}
				count += y - k;
			if (count == sum)
			{
				break;
			}
			for (i = 1 + k;i < x;i++)
			{
				System.out.printf("%d\n",a[i][j - 1]);
			}
				count += x - 1 - k;
			if (count == sum)
			{
				break;
			}
			y--;
			for (j = y - 1;j >= k;j--)
			{
				System.out.printf("%d\n",a[i - 1][j]);
			}
				count += y - k;
			if (count == sum)
			{
				break;
			}
			x--;
			for (i = x - 1;i > k;i--)
			{
				System.out.printf("%d\n",a[i][j + 1]);
			}
				count += x - 1 - k;
			k++;
			i = k;
		}
	}




}

