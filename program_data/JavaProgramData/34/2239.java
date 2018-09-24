package <missing>;

public class GlobalMembers
{
	public static int isodd(int n)
	{
			if (n % 2 == 0)
			{
					return 1;
			}
			else
			{
					return 0;
			}
	}

	public static int forodd(int n)
	{
			System.out.printf("%d/2=%d\n", n, n / 2);
			return n / 2;
	}

	public static int fornot(int n)
	{
			System.out.printf("%d*3+1=%d\n", n, n * 3 + 1);
			return (n * 3 + 1);
	}

	public static int Main()
	{
			int a = 0;
	   //     char k,s; id[120] = {0}, rate[120] = {0};

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			while (a != 1)
			{
					if (isodd(a) != 0)
					{
							a = forodd(a);
					}
					else
					{
							a = fornot(a);
					}
			}
			System.out.print("End");
			return 0;
	}

}

