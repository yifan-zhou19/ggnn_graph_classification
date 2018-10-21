package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] b = {0, 1, 2, 3, 4};
		int m;
		int n;
		int i;
		int j;
		int temp;
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
		if (m > 4 || n > 4)
		{
			System.out.print("error");
		}
		else if (m <= 4 && n <= 4)
		{
			temp = b[m];
			b[m] = b[n];
			b[n] = temp;
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",a[b[i]][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",a[b[i]][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

