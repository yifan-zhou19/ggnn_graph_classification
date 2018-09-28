package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int result = 0;
		if (m == 0 || n == 1)
		{
			return 1;
		}
		if (m < 0)
		{
			return 0;
		}

		if (m >= n)
		{
			result += f(m, n - 1) + f(m - n, n);
		}
		else
		{
			result += f(m, n - 1);
		}

		return result;
	}

		public static int Main()
		{
		int m;
		int n;
		int i;
		int t;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}

		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}

			a = f(m, n);

			if (i < t - 1)
			{

				System.out.printf("%d\n",a);
			}
			else
			{
				System.out.printf("%d",a);
			}

		}
		return 0;
		}


}

