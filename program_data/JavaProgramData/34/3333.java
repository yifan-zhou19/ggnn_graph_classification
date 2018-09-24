package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void Main()
	{
		int s = int s;
		int b = int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n != 1;)
		{
			if (n % 2 == 0)
			{
				s(n);
			}
			else
			{
				b(n);
			}
		}
		System.out.print("End");
	}
	public static int s(int s)
	{
		n = n / 2;
		System.out.printf("%d/2=%d\n",2 * n,n);
		return n;
	}
	public static int b(int b)
	{
		n = n * 3 + 1;
		System.out.printf("%d*3+1=%d\n",(n - 1) / 3,n);
		return n;
	}
}

