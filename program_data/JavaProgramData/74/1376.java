package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		if (i = Math.sqrt(n) + 1)
		{
			return 1;
		}
	}
	public static int huiwen(int n)
	{
		int temp = n;
		int k;
		int m = 0;
		while (temp > 0)
		{
			   k = temp % 10;
			   m = m * 10 + k;
			   temp = temp / 10;
		}
		if (m == n)
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
		int n;
		int i;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			if (sushu(i) == 1 && huiwen(i) == 1)
			{
				System.out.printf("%d",i);
				flag = 1;
				break;
			}
		}
		for (i = i + 1;i <= n;i++)
		{
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
				System.out.printf(",%d",i);

			}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}

		return 0;
	}

}

