package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int i;
		int d = 0;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i = i + 2)
		{
			for (a = 2;a < i;a++)
			{
				if (i % a == 0)
				{
					d = 1;
					break;
				}
				else
				{
					d = 0;
				}
			}
			if (d == 0)
			{
			b = n - i;
			for (c = 3;c < b;c = c + 2)
			{
				if (b % c == 0)



				{
				e = 1;
				break;
				}
				else
				{
					e = 0;
				}


			}
			}
			else
			{
				continue;
			}
				if (e == 0 && d == 0)
				{
				System.out.printf("%d %d\n",i,b);
				}
				else
				{
					continue;
				}

		}
		return 0;
	}
}

