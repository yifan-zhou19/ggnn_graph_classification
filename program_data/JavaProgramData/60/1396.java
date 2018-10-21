package <missing>;

public class GlobalMembers
{
	public static int shu(int a)
	{
		int i;
		int n;
		for (i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int m;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 3;j <= m - 2;j++)
		{
			if (shu(j) != 0 && shu(j + 2) != 0)
			{
				System.out.printf("%d %d\n",j,j + 2);
				sum++;
			}
		}
		if (sum == 0)
		{
			System.out.print("empty");
		}
	}

}

