package <missing>;

public class GlobalMembers
{
	public static int f2(int i,int a)
	{
		int c;
		int s = 0;
		for (i;i <= a / 2;i++)
		{
			if (a % i == 0)
			{
				c = a / i;
				if (c >= i)
				{
					s = s + f2(i, c);
				}
			}


		}
		s = s + 1;
		return s;
	}

	public static int f(int a)
	{
		int s = 0;

		s = s + f2(2, a);
		return s;
	}


	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
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
				a = Integer.parseInt(tempVar2);
			}
			b = f(a);
			System.out.printf("%d\n",b);

		}

		return 0;
	}
}

