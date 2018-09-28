package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b = 1;
		int c = 0;
		int m;
		int n;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
	while (b < m || b == m)
	{
		if (b % 7 == 0 || b % 10 == 7 || b / 10 == 7)
		{
		a = a + b * b;
		}
		c = c + b * b;
	b++;
	}
	n = c - a;
	System.out.printf("%d",n);
	return 0;
	}

}

