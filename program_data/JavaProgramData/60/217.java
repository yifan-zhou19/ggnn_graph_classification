package <missing>;

public class GlobalMembers
{
	/*????????m?????*/
	public static int f(int m)
	{
		int t;
		int k;
		k = Math.sqrt(m);
		for (t = 2;t <= k;t++)
		{
			if (m % t == 0)
			{
				break;
			}
		}
		if (t > k)
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
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i = i + 2)
		{
			if (f(i) == 1)
			{
				j = i + 2;
				if (f(j) == 1)
				{
					System.out.printf("%d %d\n",i,j);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("empty"); //??k=0????????????
		}
	}

}

