package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i = 0;
	int c;
	int d;
	int e;
	int f;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	if (n == 1)
	{
		System.out.print("End\n");
	}
	else
	{
	while (i != 1)
	{
		if (n % 2 != 0)
		{
			c = 3 * n + 1;
			d = n;
			n = c;
			System.out.printf("%d*3+1=%d\n",d,c);
		}
		else
		{
			e = n / 2;
			f = n;
			n = e;
			i = e;
			System.out.printf("%d/2=%d\n",f,e);
		}
	}
	System.out.print("End\n");
	}
	}
}

