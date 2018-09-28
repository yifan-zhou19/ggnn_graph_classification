package <missing>;

public class GlobalMembers
{
	public static int n;
	public static void js(int n)
	{
	   System.out.printf("%d*3+1=%d\n",n,n * 3 + 1);

	}
	public static void os(int n)
	{
		System.out.printf("%d/2=%d\n",n,n / 2);

	}
	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n != 1)
		{
			if (n % 2 == 1)
			{
				js(n);
				n = n * 3 + 1;
			}
		else if (n % 2 == 0)
		{
				os(n);
				n = n / 2;
		}
		}
		System.out.print("End");

	}
}

