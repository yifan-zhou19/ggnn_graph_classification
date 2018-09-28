package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int b;
		int r;
		int q = 0;
		int l = 0;
		int j;
		int p;
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
		for (i = m;i <= n;i++)
		{
			q = 0;
			p = i;
			for (j = 2;j <= i;j++)
			{
				if (i % j == 0)
				{
					b = j;
					break;
				}
			}

		while (p != 0)
		{
		r = p % 10;
		q *= 10;
		q += r;
		p /= 10;
		}
		if (q == i && b == i)
		{
			if (l == 0)
			{
			  System.out.printf("%d",i);
			  l++;
			}
		 else
		 {
			 System.out.printf(",%d",i);

		 }

		}


		}
		if (l == 0)
		{
			System.out.print("no");
		}

	return 0;
	}

}

