package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;


		for (i = 2;i <= Math.sqrt(n);i++)
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
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i < m;i++)
		{
			if (sushu(i) != 0 && sushu(m - i) != 0)
			{
				if (i <= m - i)
				{
				System.out.printf("%d %d\n",i,m - i);
				}
				else
				{
					continue;
				}
			}

		}
		return 0;
	}








}

