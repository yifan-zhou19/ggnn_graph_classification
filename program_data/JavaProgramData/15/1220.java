package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int ki;
		int kj;
		int endj;
		int endi;
		int[][] a = new int[1000][1000];
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		ki = -1;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 0)
				{
					ki = i;
					kj = j;
					break;
				}
			}
			if (ki >= 0)
			{
				break;
			}
		}
		for (i = ki,j = kj;j <= n;j++)
		{
			if (a[i][j] == 255)
			{
				endj = j - 1;
				break;
			}
		}
		for (i = ki,j = kj;i <= n;i++)
		{
			if (a[i][j] == 255)
			{
				endi = i - 1;
				break;
			}
		}
		s = (endi - ki - 1) * (endj - kj - 1);
		System.out.printf("%d",s);
	return 0;
	}
}

