package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int a;
		int b;
		int c = 0;
		int[] p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new int[n];
		for (i = 2;i <= n;i++)
		{
			a = (int)Math.sqrt(i);
			for (j = 2;j <= a;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > a)
			{
				p[m] = i;
				m++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			if (p[i + 1] - p[i] == 2)
			{
			System.out.printf("%d %d\n",p[i],p[i + 1]);
			c++;
			}
		}
		if (c == 0)
		{
			System.out.print("empty");
		}

	}

}

