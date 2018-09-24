package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i = 0;
		int t;
		int m;
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
		for (i = 0;i <= 100;i++)
		{
			if (i * Math.pow((n - 1),(n - 1)) <= k != 0 && k < (i + 1) * Math.pow((n - 1),(n - 1)))
			{
				t = i + 1;
			}
		}
		m = t * Math.pow(n,n) - n * k + k;
		System.out.printf("%d\n",m);
		return 0;


	}
}

