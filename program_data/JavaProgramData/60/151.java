package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int y = 0;
		int c;
		int q = 0;
		int p = 0;
		double z;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 4)
		{
			p = 1;
			System.out.print("3 5\n");
		}
		for (c = 5;c <= n - 2;c++)
		{
			z = Math.sqrt(c);
			for (i = 2;i <= z;i++)
			{
				if (c % i == 0)
				{
					y = 0;
					break;
				}
				if (c % i != 0)
				{
					y = y + 1;
				}
			}
			x = Math.sqrt(c + 2);
				for (i = 2;i <= x;i++)
				{
					 if ((c + 2) % i == 0)
					 {
					q = 0;
					break;
					 }
					if ((c + 2) % i != 0)
					{
					q = q + 1;
					}
				}
				if (y != 0 && q != 0)
				{
					p = 1;
					System.out.printf("%d %d\n",c,c + 2);
				}
		}
		if (p == 0)
		{
			System.out.print("empty");
		}




	}
}

