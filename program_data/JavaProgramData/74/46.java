package <missing>;

public class GlobalMembers
{
	public static int z(int i)
	{
		int r;
		for (r = 2;r <= Math.sqrt(i);r++)
		{
			if (i % r == 0)
			{
				break;
			}
		}
		 if (r <= Math.sqrt(i))
		 {
			 return 0;
		 }
		 else
		 {
			 return 1;
		 }
	}
	public static int h(int i)
	{
		int y = 0;
		int k;
		k = i;
		while (i != 0)
		{
			y = 10 * y + i % 10;
			i = i / 10;
		}

		if (y == k)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int m;
		int n;
		int i;
		int r;
		int t;

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

		r = 0;

		for (i = m;i <= n;i++)
		{
		   if (z(i) == 1 && h(i) == 1)
		   {
			   System.out.printf("%d",i);
			   r = 1;
			   break;
		   }
		}

		for (t = i + 1;t <= n;t++)
		{
			if (z(t) == 1 && h(t) == 1)
			{
				System.out.printf(",%d",t);
			}
		}

		if (r == 0)
		{
		System.out.print("no");
		}
	}
}

