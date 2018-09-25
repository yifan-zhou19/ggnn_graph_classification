package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int a = 0;
		int b = 0;
		int c = 0;
		int d;
		int p = 0;
		int q = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (m % 2 == 0)
		{
			m = m + 1;
		}
		for (i = m;i <= n;i = i + 2)
		{
			for (j = 3;j <= Math.sqrt(i);j = j + 2)
			{
				if (i % j != 0)
				{
					b = b + 1;
				}
				else
				{
					b = 0;
					break;
				}
			}
			  if (b != 0)
			  {
				  d = i;
				  q = q + 1;
				  while (d > 0)
				  {
					a = d % 10;
					c = 10 * c + a;
					d = d / 10;
				  }
				if (c == i)
				{
					p = p + 1;
				k = k + 1;
				if (p == 1)
				{
					System.out.printf("%d",i);
				c = 0;
				}
				else
				{
					System.out.printf(",%d",i);
				c = 0;
				}
				}
			  else
			  {
				  c = 0;
			  }
			  }





		}

				if (q == 0 || k == 0)
				{
				System.out.print("no");
				}
	}
}

