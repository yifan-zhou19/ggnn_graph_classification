package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 1;
		int n;
		int k;
		int s = 1;
		int t;
		int i;
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
		for (i = 1;i <= n;i++)
		{
			m = m * n;
			s = s * (n - 1);
		}
		t = (n - 1) * k / s + 1;
		m = t * m - (n - 1) * k;
		System.out.printf("%d",m);
	}
}

