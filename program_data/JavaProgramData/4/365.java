package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int s;
		int t;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			t = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < s;i++)
		{
			for (j = 0;j < t;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
			System.out.print("\n");
		}
		for (d = 0;d < s + t - 1;d++)
		{
			for (i = 0;i < s;i++)
			{
				for (j = 0;j < t;j++)
				{
					if (i + j == d)
					{
						System.out.printf("%d\n",a[i][j]);
					}
				}
			}
		}
		return 0;
	}
}

