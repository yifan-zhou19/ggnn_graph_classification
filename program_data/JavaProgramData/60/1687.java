package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int n;
		int j;
		int m;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		for (i = 3;i < n - 1;i++)
		{
			b = 0;
		c = 0;
	for (j = 2;j < i;j++)
	{
				if (i % j == 0)
				{
					b++;
				}
	}
			m = i + 2;
			for (j = 2;j < m;j++)
			{
				if (m % j == 0)
				{
					c++;
				}
			}
		if (b + c == 0)
		{
			a++;
			System.out.printf("%d %d\n",i,m);

		}
		}
	if (a == 0)
	{
	System.out.print("empty");
	}
	}


}

