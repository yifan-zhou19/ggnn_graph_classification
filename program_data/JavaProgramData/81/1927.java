package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int temp;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
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
		if (m <= 4 && n <= 4 && m != n)
		{
			for (j = 0;j < 5;j++)
			{
				temp = a[m][j];
				a[m][j] = a[n][j];
				a[n][j] = temp;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d",a[i][j]);
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
		}
	}
}

