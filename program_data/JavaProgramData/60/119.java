package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int k = 0;
		{
			for (k = 2;k <= x / 2;k++)
			{
			if (x % k == 0)
			{
				return 0;
			}
			}
		}
		return 1;
	}
	public static void Main()
	{
		int a = 0;
		int b = 0;
		int n = 0;
		int i = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i++)
		{
			if (sushu(i) == 1 && sushu(i + 2) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
			m = 1;
			}
		}
		if (m == 0)
		{
			System.out.print("empty");
		}
	}
}

