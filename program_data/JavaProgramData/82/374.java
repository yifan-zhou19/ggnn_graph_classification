package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[100][2];
		int b = 0;
		int a = 0;
		for (int i = 0;i < n;i++)
		{
			for (int k = 0;k < 2;k++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][k] = Integer.parseInt(tempVar2);
			}
			}
			if ((sz[i][0] >= 90) && (sz[i][0] <= 140) && (sz[i][1] >= 60) && (sz[i][1] <= 90))
			{
				a = a + 1;
				if (a > b)
				{
					b = a;
				}
			}
			else
			{
				a = 0;
			}

		}
		System.out.printf("%d",b);


		return 0;
	}


}

