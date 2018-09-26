package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][10];
		int i;
		int[][] s = new int[100][5];
		int[] x = new int[100];
		int num = 1;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[1][i] = Integer.parseInt(tempVar);
			}
		}
		while (a[num][1] != 0)
		{
			s[num][1] = a[num][1] * 3600 + a[num][2] * 60 + a[num][3];
			s[num][2] = (a[num][4] + 12) * 3600 + a[num][5] * 60 + a[num][6];
			x[num] = s[num][2] - s[num][1];
			System.out.printf("%d\n",x[num]);
			num = num + 1;
			for (i = 1;i <= 6;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[num][i] = Integer.parseInt(tempVar2);
				}
			}
		}
	}

}

