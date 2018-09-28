package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int j;
		for (j = 2;j < x;j++)
		{
			if (x % j == 0)
			{
				break;
			}
		}
		if (j == x)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m - i;i++)
		{
			a = sushu(i);
			b = sushu(m - i);
			if (a == 1 && b == 1)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}

		return 0;
	}
}

