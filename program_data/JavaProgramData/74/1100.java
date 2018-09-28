package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int r = 0;
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
			m++;
		}
		if (n % 2 == 0)
		{
			n++;
		}
		for (i = m;i <= n;i = i + 2)
		{
			for (j = i,t = 0;j > 0;)
			{
				t = t * 10 + j % 10;
				j = j / 10;
			}
			if (t == i)
			{
				for (k = 3;k < t;k = k + 2)
				{
					if (t % k == 0)
					{
						break;
					}
				}
				if (k == t)
				{
					r++;
				}
				if (k == t && r == 1)
				{
					System.out.printf("%d",t);
				}
				if (k == t && r > 1)
				{
					System.out.printf(",%d",t);
				}
			}
		}
		if (r == 0)
		{
			System.out.print("no");
		}
	}

}

