package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a = 0;
		int b = 10;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 1)
		{
						if (n - (n / 2) * 2 == 0)
						{
									  b = n / 2;
									  System.out.printf("%d/2=%d\n",n,b);
									  n = b;
						}
						else
						{
									  b = n * 3 + 1;
									  System.out.printf("%d*3+1=%d\n",n,b);
									  n = b;
						}
		}
		System.out.print("End");
	}
}

