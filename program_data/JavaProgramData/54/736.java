package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int s;
		int t;
		int a = 1;
		int b = 1;
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
		for (s = 0;s < n;s++)
		{
			a = a * n;
		}
		for (t = 0;t < n - 1;t++)
		{
			b = b * (n - 1);
		}
		m = (k + 1) * a / b - +k - n * k;
		while ((m + k * n - k) % a != 0)
		{
			m = m + 1;
		}
		System.out.printf("%d",m);
	}
}

