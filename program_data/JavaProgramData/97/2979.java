package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int c;
		int d;
		int e;
		int i;
		int j;
		int k;
		int l;
		int n;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m % 100;
		i = (m - a) / 100;
		b = (m - i * 100) % 50;
		j = (m - i * 100 - b) / 50;
		c = (m - i * 100 - j * 50) % 20;
		k = (m - i * 100 - j * 50 - c) / 20;
		d = (m - i * 100 - j * 50 - k * 20) % 10;
		l = (m - i * 100 - j * 50 - k * 20 - d) / 10;
		e = (m - i * 100 - j * 50 - k * 20 - 10 * l) % 5;
		n = (m - i * 100 - j * 50 - k * 20 - 10 * l - e) / 5;
		q = m - i * 100 - j * 50 - k * 20 - 10 * l - 5 * n;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",i,j,k,l,n,q);
		return 0;
	}
}

