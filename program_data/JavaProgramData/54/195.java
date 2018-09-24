package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m = 0;
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
		for (i = 1;m == 0;i++)
		{
			m = (n - 1) * i;
			r = m % (n - 1);
			for (j = n;(j > 0) && (r == 0);j = j - 1)
			{
				m = n * m / (n - 1) + k;
				r = m % (n - 1);
			}
			if (r == 0 || j == 0)
			{
				m = m;
			}
			else
			{
				m = 0;
			}
		}
		System.out.printf("%d",m);
	}

}

