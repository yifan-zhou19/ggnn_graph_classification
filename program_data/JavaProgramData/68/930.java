package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		double b;
		b = Math.sqrt(a);
		if (a % 2 == 0)
		{
			return 0;
		}
		else
		{
			for (i = 3;i <= b;i = i + 2)
			{
				if (a % i == 0)
				{
					return 0;
				}
			}
			return 1;
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int a;
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j <= i;j++)
			{
				if (sushu(j) != 0)
				{
				a = i - j;
				if (sushu(a) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,a);
					break;
				}
				}
			}
		}
		return 0;
	}
}

