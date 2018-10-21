package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int k;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (m = n;;m++)
		{
			r = m;
			for (i = 1;i <= n;i++)
			{
				if (k != r - (r / n) * n)
				{
					r = r - k - r / n;
					break;
				}
				else
				{
					r = r - k - r / n;
				}
			}
			if (i == n + 1 && r / (n - 1) >= 1)
			{
				break;
			}
		}
		System.out.printf("%d\n",m);
	}
}

