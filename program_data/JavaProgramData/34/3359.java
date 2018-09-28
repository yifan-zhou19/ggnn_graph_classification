package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int bb = int n;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		bb(n);
	}
	public static int bb(int n)
	{
		int m;
		if (n == 1)
		{
		System.out.print("End");
		}
		else
		{
			if (n % 2 == 0)
			{
				System.out.printf("%d/2=%d\n",n,m = n / 2);
			}
			else
			{
				System.out.printf("%d*3+1=%d\n",n,m = n * 3 + 1);
			}
			bb(m);
		}
	}
}

