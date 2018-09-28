package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int s = 0;
	int j;
	int f = 0;
	int q = 0;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 2;i <= n;i++)
	{
		for (j = 2;j < i;j++)
		{
			if (i % j != 0)
			{
				s += 1;
			}
		}
		if (s == i - 2)
		{
			k = i + 2;
			if (k > n)
			{
				break;
			}
			for (j = 2;j < k;j++)
			{
				if (k % j != 0)
				{
				   q += 1;
				}
			}
			if (q == i)
			{
				System.out.printf("%d %d\n",i,k);
				f++;
			}
		}
		s = 0;
		q = 0;
	}
	if (f == 0)
	{
		System.out.print("empty\n");
	}
	return 0;
	}

}

