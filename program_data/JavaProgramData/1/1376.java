package <missing>;

public class GlobalMembers
{
	public static int f(int a, int b)
	{
		int sum = 1;
		int i;
		if (a < b)
		{
			return 0;
		}
		for (i = b;i < a;i++)
		{
			if (a % i != 0)
			{
				continue;
			}
			else
			{
				sum = sum + f(a / i, i);
			}
		}
		return sum;
	}

	public static int Main()
	{
		int n;
		int[] c = new int[100];
		int i;
		int a;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 1;i <= n;i++)
		{
			a = c[i];
			sum = f(a, 2);
			System.out.printf("%d\n",sum);
		}
		return 0;
	}






}

