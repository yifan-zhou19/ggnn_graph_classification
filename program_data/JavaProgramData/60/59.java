package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int i;
		if (a % 2 == 0)
		{
			return 0;
		}
		else
		{
		for (i = 3;i < Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		if (i > Math.sqrt(a))
		{
			return 1;
		}
		else
		{
			return 0;
		}
		}
	}
	public static void Main()
	{
		int sushu = int a;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 3;(i + 2) <= n;i++)
		{
			if (sushu(i) != 0 && sushu(i + 2) != 0)
			{
				System.out.printf("%d %d\n",i,i + 2);
			}
			else
			{
				continue;
			}
		}
		for (i = 3;(i + 2) <= n;i++)
		{
			if (sushu(i) != 0 && sushu(i + 2) != 0)
			{
				break;
			}
		}
		if (i == n || i == n - 1)
		{
			System.out.print("empty");
		}
	}
}

