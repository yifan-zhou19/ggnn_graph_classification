package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int s = 1;
		int i;
		for (i = 3;i <= Math.sqrt(n);i += 2)
		{
			if (n % i == 0)
			{
				s = 0;
			}
		}
		return s;
	}

	public static void Main()
	{
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i += 2)
		{
			if (sushu(i) == 1 && sushu(m - i) == 1)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}
	}

}

