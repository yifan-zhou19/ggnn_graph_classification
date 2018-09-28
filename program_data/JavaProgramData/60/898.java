package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int n;
		int j;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 3;j <= n - 2;j = j + 2)
		{
			if (sushu(j) != 0 && sushu(j + 2) != 0)
			{
			   System.out.printf("%d %d\n",j,j + 2);
			   m++;
			}
		}
		if (m == 0)
		{
			System.out.print("empty");
		}

		return 0;

	}
}

