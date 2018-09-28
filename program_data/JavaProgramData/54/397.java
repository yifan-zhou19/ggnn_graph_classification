package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int k;
		int i;
		int t;
		int a;
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
		t = n - 1;
		a = 1;
		i = 1;
		m = a;
		while (i <= t)
		{
			if ((n * m + k) % t == 0)
			{
				m = (n * m + k) / t;
				i = i + 1;
			}
			else
			{
				i = 1;
				a = a + 1;
				m = a;
			}
		}
		m = n * m + k;
		System.out.printf("%d\n",m);
	}
}

