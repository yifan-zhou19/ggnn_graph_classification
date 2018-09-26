package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int j;
		for (j = 2;j < x;j++)
		{
			if (x % j == 0)
			{
				return 0;
			}
		}
					  return 1;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int prime(int x);
	public static int Main()
	{
		int n;
		int a;
		int b;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		else
		{
		for (x = 2;x <= n - 2;x++)
		{
			a = prime(x);
			b = prime(x + 2);
			if (a != 0 && b != 0)
			{
				System.out.printf("%d %d\n",x,(x + 2));
			}
		}
		}
	}
}

