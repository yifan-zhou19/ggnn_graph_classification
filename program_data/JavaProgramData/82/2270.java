package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int plow;
		int phigh;
		int k;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1,k = 0,m = 0;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			phigh = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			plow = Integer.parseInt(tempVar3);
		}
		if ((plow >= 60) && (plow <= 90) && (phigh >= 90) && (phigh <= 140))
		{
		k++;
		}
		else
		{
			if (k > m)
			{
		m = k;
		k = 0;
			}
			else
			{
		k = 0;
			}
		}
		}
		if (k > m)
		{
			m = k;
		}
		System.out.printf("%d",m);
	}
}

