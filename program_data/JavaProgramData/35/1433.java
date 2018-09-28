package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int a = 0;
		int b;
		int c;
		int d;
		int e;
		int f = 0;
		int[][] shuzu = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shuzu[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if (shuzu[i][j] >= a)
				{
					a = shuzu[i][j];
					b = j;
					d = i;
				}
			}
			e = a;
			for (c = 0;c < n;c++)
			{
				if (a > shuzu[c][b])
				{
					a = shuzu[c][b];
				}
			}
			if (e == a)
			{
				System.out.printf("%d+%d",d,b);
				return 0;
			}
		}

			System.out.print("No");

		return 0;
	}
}

