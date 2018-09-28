package <missing>;

public class GlobalMembers
{
	public static int ssd(int i)
	{
		int j;
		j = i - 2;
		for (int p = 2;p < i;p++)
		{
			if (i % p == 0)
			{
				return 0;
			}
		}
		for (int q = 2;q < j;q++)
		{
			if (j % q == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int j;
		int n;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1 || n == 2 || n == 4)
		{
			System.out.print("empty\n");
			return 0;
		}
		if (n == 3)
		{
			System.out.print("1 3\n");
			return 0;
		}
		if (n == 5)
		{
			System.out.print("3 5\n");
			return 0;
		}
		for (int i = 5;i <= n;i++)
		{
			j = i - 2;
			if (ssd(i) != 0)
			{
				System.out.printf("%d %d\n",j,i);
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("empty\n");
		}
		return 0;
	}



}

