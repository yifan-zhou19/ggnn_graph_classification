package <missing>;

public class GlobalMembers
{
	public static int sushu(double a)
	{
		int i;
		int n;
		int s;
		if ((int) a % 2 == 0)
		{
			return 0;
		}
		s = Math.sqrt(a);
		for (i = 3;i <= s;i += 2)
		{
			if ((int)a % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			if (sushu((double) i) != 0 && sushu((double) m - i) != 0)
			{
				System.out.printf("%d %d\n", i,m - i);
			}
		}
	}
}

