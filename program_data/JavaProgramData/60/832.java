package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		int p;
		int q;
		int g;
		int r;

		g = 0;
		r = 0;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 3)
		{
			System.out.print("empty");
		}
		for (i = 3;i <= n;i++)
		{
			a = 0;
			for (j = 2;j < i;j++)
			{

				m = i % j;
				if (m == 0)
				{
					a++;
				}

			}

			if (a == 0 && g != 0)
			{
				p = q;
				q = i;
				if ((q - p) == 2)
				{
					System.out.printf("%d %d\n",p,q);
					r++;

				}
			}
			if (a == 0 && g == 0)
			{
				q = i;
				g++;

			}

		}
		if (r == 0)
		{
			System.out.print("empty");
		}

	}


}

