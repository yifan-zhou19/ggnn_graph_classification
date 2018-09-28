package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		a = 0;
		b = 0;
		for (i = 1;i < 100;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		if (c > a)
		{
			b = a, a = c;
		}

		else if (c < a && c >= b)
		{
			b = c;
		}
	else if (c = a)
	{
	c = a;
	}
		}

	System.out.printf("%d\n",a);
	System.out.printf("%d\n",b);
	return 0;
	}

}

