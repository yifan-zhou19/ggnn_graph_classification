package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int c = 0;
	if (n == 0)
	{
	  return 0;
	}
	if (n == 1 || n == 2)
	{
	  return 1;
	}
	if (n > 2)
	{
	  int a = 1;
	  int b = 1;
	  int c = 0;
	for (int i = 2;i < n;i++)
	{
	c = a + b;
	a = b;
	b = c;
	}

	return c;
	}
	}
	public static int Main()
	{
		int n;
		int m;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
	for (int k = 0;k < m;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
		result = F(n);
		System.out.printf("%d\n", result);
	}
		return 0;
	}
}

