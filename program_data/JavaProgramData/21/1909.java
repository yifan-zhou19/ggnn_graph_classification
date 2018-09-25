package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		//freopen("in.txt", "r", stdin);

		int[] a = new int[300];
		int n;
		int i;
		int j;
		int k;
		int l;
		int m;
		double s;
		double t;
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					l = a[j];
					a[j] = a[j + 1];
					a[j + 1] = l;
				}
			}
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			m = m + a[i];
		}
		(double) m;
		(double) a[0];
		(double) a[n - 1];
		q = (double)m / n;
		s = q - (double)a[0];
		t = a[n - 1] - q;
		(int) a[0];
		(int) a[n - 1];
		if (t < s)
		{
			System.out.printf("%d",a[0]);
		}
		else if (t == s)
		{
			System.out.printf("%d,%d",a[0],a[n - 1]);
		}
		else
		{
			System.out.printf("%d",a[n - 1]);
		}
		return 0;
	}
}

