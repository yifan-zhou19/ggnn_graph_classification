package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (a = 3;a <= n - 2;a++)
	{
		for (i = 2;i <= Math.sqrt(a);i++)
		{
			if (a % i == 0)
			{
			break;
			}
		}
		if (i > Math.sqrt(a))
		{
		b = a + 2;
		}
		else
		{
		continue;
		}
		for (i = 2;i <= Math.sqrt(b);i++)
		{
			if (b % i == 0)
			{
			break;
			}
		}
		if (i > Math.sqrt(b))
		{
		System.out.printf("%d %d\n",a,b);
		m = 1;
		}
	}
	if (m == 0)
	{
	System.out.print("empty");
	}
	return 0;
	}
}

