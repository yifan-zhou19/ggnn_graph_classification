package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void a(int b,int n);
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		a(c, 5);
	}


	public static void a(int b,int n)
	{
		if (n == 1)
		{
			if (b % 10 != 0)
			{
				System.out.printf("%d",b % 10);
			}
		}
		else
		{
			if (b % 10 != 0)
			{
				System.out.printf("%d",b % 10);
			}
			b = b / 10;
			a(b, n - 1);
		}
	}

}

