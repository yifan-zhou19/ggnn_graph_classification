package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int i;
		int k;
		k = Math.sqrt(x);
		for (i = 2;i <= k;i++)
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
		int a;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 3;i <= a - 2;i++)
			{
			j = 0;
			j = sushu(i) + sushu(i + 2);
			if (j == 2)
			{
				System.out.printf("%d %d\n",i,i + 2);
			}
			};
		}
	}
}

