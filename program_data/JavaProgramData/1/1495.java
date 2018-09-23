package <missing>;

public class GlobalMembers
{
	public static int function(int a, int m)
	{
		int sum = 1;
		int i;
		if (a > m)
		{
			return 0;
		}
		else
		{
			for (i = a;i < m;i++)
			{
				if (m % i == 0)
				{
					sum = sum + function(i, m / i);
				}
				else
				{
				continue;
				}
			}
		return sum;

		}
	}

	public static void Main()
	{
		int n;
		int i;
		int[] m = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			System.out.printf("%d\n",function(2, m[i]));

		}
	}



}

