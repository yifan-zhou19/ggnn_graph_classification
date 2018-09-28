package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int j;
		int i;
		int[] a = new int[1000];
		int e;
		int[][] b = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}


		for (i = 0;i <= n - 1;i++)
		{
		for (j = 0;j <= n - 1;j++)
		{
			b[i][j] = a[i] + a[j];
			if (b[i][j] == k)
			{
				System.out.print("yes");
				break;
			}
			if (i == n - 1 && j == n - 1)
			{
	System.out.print("no");
			}
		}
	if (b[i][j] == k)
	{

				break;
	}
		}

	return 0;
	}
}

