package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huiwen = int num;
		int zhishu = int num;
		int m;
		int n;
		int i;
		int flag = 0;
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
		for (i = m;i <= n;i++)
		{
			if (huiwen(i) == 1 && zhishu(i) == 1)
			{
				System.out.printf("%d",i);
				flag = 1;
				break;
			}
		}
		i = i + 1;
		if (flag == 1)
		{
			for (;i <= n;i++)
			{
				if (huiwen(i) == 1 && zhishu(i) == 1)
				{
					System.out.printf(",%d",i);
				}
			}
		}
		else
		{
			System.out.print("no\n");
		}
	}
	public static int huiwen(int num)
	{
		int n = 0;
		int m;
		m = num;
		while (m != 0)
		{
			n = n * 10 + m % 10;
			m = m / 10;
		}
		if (n == num)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int zhishu(int num)
	{
		int i;
		if (num % 2 == 0)
		{
			return 0;
		}
		else
		{
			for (i = 3;i <= num / 2;i = i + 2)
			{
				if (num % i == 0)
				{
					return 0;
					break;
				}
			}
		}
		return 1;
	}






}

