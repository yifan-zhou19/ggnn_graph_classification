package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int p;
		int q;
		int f;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}

		for (i = 1;;i++)
		{
			p = i;
			for (j = 1;j <= n;j++)
			{
				q = p * n + k;
				f = q % (n - 1);
				if (f != 0)
				{
					break;
				}
				else
				{
					p = q / (n - 1);
				}
			}
			if ((j == n + 1) || (j == n))
			{
				break;
			}
		}
		System.out.printf("%d",q);

		return 0;
	}


}

