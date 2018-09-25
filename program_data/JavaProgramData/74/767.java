package <missing>;

public class GlobalMembers
{
	public static int huiwen(int n)
	{
		int temp;
		int s = 0;
		temp = n;
		while (n > 0)
		{
			s = s * 10 + (n % 10);
			n = n / 10;
		}
		if (s == temp)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int sushu(int n)
	{
		int i;
		for (i = 2;i < n;i++)
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
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int first = 1;
		int flag = 1;
		for (int j = m;j <= n;j++)
		{
			if (sushu(j) != 0 && huiwen(j) != 0)
			{
				if (first == 1)
				{
					System.out.printf("%d",j);
					first = 0;
				}
				else
				{
					System.out.printf(",%d",j);
				}
				flag = 0;
			}
		}
		if (flag == 1)
		{
			System.out.print("no");
		}
		return 0;
	}

}

