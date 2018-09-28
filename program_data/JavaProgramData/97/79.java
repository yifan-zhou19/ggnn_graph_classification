package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int p;
		int q;
		int r;
		int s;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n >= 100)
		{
			n = n - 100;
			a++;
		}
		m = n;
		while (m >= 50)
		{
			m = m - 50;
			b++;
		}
		p = m;
		while (p >= 20)
		{
			p = p - 20;
			c++;
		}
		q = p;
		while (q >= 10)
		{
			q = q - 10;
			d++;
		}
		r = q;
		while (r >= 5)
		{
			r = r - 5;
			e++;
		}
		s = r;
		while (s >= 1)
		{
			s = s - 1;
			f++;
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,f);
		return 0;
	}
}

