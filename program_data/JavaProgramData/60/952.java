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
		int c = 0;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 5;i <= n;i++)
		{
			p = i - 2;
			q = i;
			a = 0;
			b = 0;
			for (j = 2;j < p;j++)
			{
				if (p % j == 0)
				{
					a = 1;
					break;
				}
			}
			for (j = 2;j < q;j++)
			{
				if (q % j == 0)
				{
					b = 1;
					break;
				}
			}
			if (a == 0 && b == 0)
			{
				System.out.printf("%d %d\n",i - 2,i);
				c = 1;
			}
		}
		if (c == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}
}

