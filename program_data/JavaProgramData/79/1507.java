package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int r;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (n != 0 && m != 0)
		{
		if (n >= 2)
		{
			for (i = 2,r = 1;i <= n;i++)
			{
				r = (r + m % i) % i;
				if (r == 0)
				{
					r = i;
				}
			}
		}
		else if (n == 1)
		{
			r = 1;
		}
			System.out.printf("%d\n",r);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
}

