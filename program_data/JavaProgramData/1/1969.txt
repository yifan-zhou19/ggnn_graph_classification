package <missing>;

public class GlobalMembers
{
	public static int sushu(int a)
	{
		int b = 2;
		int c;
		int d = 0;
		int k;
			while (b < a)
			{
				c = a % b;
				if (c != 0)
				{
					b = b + 1;
					d = d + 1;
				}
			else
			{
				break;
			}
			}

			if (d == (a - 2))
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
		return k;
	}
	public static int zheng(int n,int i)
	{
		int sum = 1;
		int a;
		for (a = i;a < n / 2;a++)
		{
			if (n % a == 0)
			{
				if (a <= n / a)
				{
					sum = sum + zheng(n / a, a);
				}
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int[] b = new int[10000];
		int[] e = new int[40000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				e[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{

			if (sushu(e[i]) == 0)
			{
				b[i] = zheng(e[i], 2);
			}
			else
			{
				b[i] = 1;
			}

		}

		System.out.printf("%d",b[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf("\n%d",b[i]);
		}
		return 0;
	}
}

