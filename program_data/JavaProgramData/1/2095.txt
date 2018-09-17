package <missing>;

public class GlobalMembers
{
	public static int panduansushu(int t)
	{
		int i;
		for (i = 2;i < t;i++)
		{
			if (t % i == 0)
			{
				break;
			}
		}
		if (i > t / 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int sum = 0;
	public static void fun(int n,int i)
	{
		if (n == 1)
		{
			sum++;
		}
		for (;i <= n;i++)
		{
			if (n % i == 0)
			{
				fun(n / i, i);
			}
		}
	}

	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int res;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			if (panduansushu(a[j]) == 1)
			{
				System.out.print("1\n");
			}
			else
			{
				for (i = 2,res = 1;i < a[j] / 2;i++)
				{
				if (a[j] % i == 0)
				{
					sum = 0;
					fun(a[j] / i, i);
					res += sum;
				}

				}
			System.out.printf("%d\n",res);
			}
		}
	}
}

