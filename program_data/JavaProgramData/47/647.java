package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int[][] shuzu = new int[Row][Len];
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuzu[0][i] = Integer.parseInt(tempVar2);
			}
		}
		int j;
		int r;
			r = 0;
		for (j = n - 1;j >= 0;j--)
		{

			shuzu[1][r] = shuzu[0][j];
			r++;
		}
		for (r = 0;r < n - 1;r++)
		{
		System.out.printf("%d ",shuzu[1][r]);
		}
		System.out.printf("%d",shuzu[1][n - 1]);
		return 0;
	}

}

