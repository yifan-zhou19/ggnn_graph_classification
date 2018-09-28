package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		r = 0;
		for (i = 2;i <= n - 2;i++)
		{
			k = 1;
			p = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					k = 0;
					break;
				}
			}
			for (j = 2;j < i + 2;j++)
			{
				if ((i + 2) % j == 0)
				{
					p = 0;
					break;
				}
			}
			if ((p * k) == 1)
			{
				System.out.printf("%d %d\n",i,i + 2);
				r++;
			}
		}
		if (r == 0)
		{
			System.out.print("empty");
		}
	}
}

