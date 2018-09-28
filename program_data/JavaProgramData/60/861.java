package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int a;
	int b;
	int m;
	int p;
	int l;
	l = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 3;i <= n;i++)
	{
		for (j = i - 1;j >= 2;j--)
		{
			a = i % j;
			if (a == 0)
			{
				break;
			}
		}
		if (j == 1)
		{
			b = i - 2;
			if (b <= n)
			{
		for (m = b - 1;m >= 2;m--)
		{
			p = b % m;
				if (p == 0)
				{
				break;
				}
		}
		if (m == 1)
		{
				System.out.printf("%d %d\n",b,i);
				l = 1;
		}
			}

		}
	}
		if (l == 0)
		{
			System.out.print("empty");
		}

	return 0;
	}



}

