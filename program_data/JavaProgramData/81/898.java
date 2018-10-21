package <missing>;

public class GlobalMembers
{
	public static int f(int[][] array, int m, int n)
	{
		int temp;
		int k;
		if (0 <= m != 0 && m <= 4 && 0 <= n != 0 && n <= 4)
		{
			for (k = 0;k < 5;k++)
			{
				temp = (*(array + m) + k);
				*(*(array + m) + k) = *(*(array + n) + k);
				*(*(array + n) + k) = temp;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (f(a, m, n) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",a[i][j]);
				}
				System.out.print("\n");
			}
		}
		else if (f(a, m, n) == 0)
		{
			System.out.print("error");
		}
	}
}

