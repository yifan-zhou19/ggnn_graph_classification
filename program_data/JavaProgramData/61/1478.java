package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int c;
		if (n == 1)
		{
		c = 1;
		}
		if (n == 2)
		{
			c = 1;
		}
		if (n > 2)
		{
			int a = 1;
			int b = 1;
			for (int i = 1;i < n - 1;i++)
			{
				c = a + b;
				a = b;
				b = c;
			}
		}
	return c;
	}
	public static int Main()
	{
	int n;
	int[] sz = new int[21];
	int i;
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
		   sz[i] = Integer.parseInt(tempVar2);
	   }
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%d\n",f(sz[i]));
	}
	return 0;
	}
}

