package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = int x;
		int i;
		int n;
		int j;
		int k;
	k = 0;
	i = 0;
	j = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n - 2;i++)
		{
			j = (a(i) == 1 && a(i + 2) == 1);
			if (j == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				k = k + j;

			}
		}
			if (k == 0)
			{
				System.out.print("empty\n");
			}
			return 0;
	}
	public static int a(int x)
	{
		int m;
		int s;
		int p;
		int q;
		p = 0;
		for (m = 2;m < x;m++)
		{
			s = (x % m == 0);
			p = p + s;
		}
		if (p == 0)
		{
			q = 1;
		}
		else
		{
			q = 0;
		}
		return (q);
	}

}

