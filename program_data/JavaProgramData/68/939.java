package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		int j;
		double h;

		if (n == 2)
		{
			return 1;
		}
		h = Math.sqrt(n) + 1;
		j = (int)h;
		for (i = 3;i <= j;i = i + 2)
		{
			if (n % i == 0)
			{
			return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (m = 3;m <= i / 2;m = m + 2)
			{
				if (sushu(m) != 0 && sushu(i - m) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,m,i - m);
					break;
				}
			}
		}
		return 0;

	}

}

