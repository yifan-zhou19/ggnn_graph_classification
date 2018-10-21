package <missing>;

public class GlobalMembers
{
	public static int huiwen(int i)
	{
		int temp = i;
		int k;
		int n = 0;
		while (temp > 0)
		{
			k = temp % 10;
			n = n * 10 + k;
			temp = temp / 10;
		}
		if (n == i)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	public static int zhishu(int i)
	{
		int j;
		int s = 0;
		if (i == 2 || i == 3)
		{
			return (0);
		}
		for (j = 2;(j * j) <= i;j++)
		{
			if (i % j == 0)
			{
				s++;
			}
		}
		if (s == 0)
		{
			return (0);
		}
		else
		{
			return (1);
		}

	}
	public static void Main()
	{
		int m;
		int n;
		int[] x = new int[100];
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
		int i;
		int k = 0;
		for (i = m;i <= n;i++)
		{
			if (huiwen(i) == 0 && zhishu(i) == 0)
			{
				x[k] = i;
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < k;i++)
			{
				if (i != k - 1)
				{
					System.out.printf("%d,",x[i]);
				}
				else
				{
					System.out.printf("%d\n",x[i]);
				}
			}
		}
	}

}

