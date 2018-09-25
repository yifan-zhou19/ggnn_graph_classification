package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int c;
		int d;
		int e;
		int p;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (m % 2 == 0)
		{
			m = m + 1;
		}
		for (;m <= n;m = m + 2)
		{
			for (a = 2;m % a != 0;a = a + 1)
			{
				;
			}
			if (m == a)
			{
				for (p = 0,e = m;e >= 10;)
				{
					c = e / 10;
					d = e-10 * c;
					e = c;
					p = 10 * p + d;
				}
				p = 10 * p + e;
				if (p == m)
				{
					j = j + 1;
					if (j == 1)
					{
						System.out.printf("%d",p);
					}
				else
				{
					System.out.printf(",%d",p);
				}
				}
			}
		}
		if (j == 0)
		{
			System.out.print("no\n");
		}
	}
}

