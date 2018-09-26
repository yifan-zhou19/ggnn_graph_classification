package <missing>;

public class GlobalMembers
{
	public static int work(int[][] arr, int m, int n)
	{
		int k;
		int t;
		if ((m >= 0) && (m < 5) && (n >= 0) && (n < 5))
		{
			for (k = 0;k < 5;k++)
			{
				t = arr[m][k];
				arr[m][k] = arr[n][k];
				arr[n][k] = t;
			}
			return 1;
		}
	   else
	   {
		   return 0;
	   }
	}

	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (work(a, m, n) == 1)
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
		else
		{
			System.out.print("error\n");
		}
		return 0;
	}
}

