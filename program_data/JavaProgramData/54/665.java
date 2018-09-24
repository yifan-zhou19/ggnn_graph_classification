package <missing>;

public class GlobalMembers
{
	public static int sum(int m,int n,int k)
	{
		int i;
		int t;
	for (i = 0;i < n - 1;i++)
	{
		t = (m * n + k) / (n - 1);
	if (t * (n - 1) == (m * n + k))
	{
		m = t;
	}
	else
	{
		m = 0;
		break;
	}
	}
	return (m);
	}

	public static int Main()
	{
		int n;
		int k;
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
		int m;
		for (m = 1; ;m++)
		{
			if (sum(m, n, k) != 0)
			{
				System.out.printf("%d",sum(m, n, k) * n + k);
				break;
			}
		else
		{
			continue;
		}
		}
		return 0;
	}

}

