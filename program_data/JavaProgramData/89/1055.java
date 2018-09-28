package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int i;
		int j;
		int k;
		int[][] a = new int[2][100000];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= num - 1;i++)
		{
			a[0][i] = 0;
			a[1][i] = 0;
		}
		for (;;)
		{
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
			if (m == 0 && n == 0)
			{
				break;
			}
			else
			{
				a[0][m] = a[0][m] + 1;
				a[1][n] = a[1][n] + 1;
			}
		}
		for (i = 0;i <= num - 1;i++)
		{
			if (a[0][i] == 0 && a[1][i] == num - 1)
			{
				System.out.printf("%d",i);
			}
		}
	}
}

