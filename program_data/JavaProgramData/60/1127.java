package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		if (x == 2)
		{
			return 1;
		}
		else
		{
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
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
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
		for (i = 2;i <= n - 2;i++)
		{
			if (sushu(i) == 1 && sushu(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
			}
		}
		}
			return 0;
	}


}

