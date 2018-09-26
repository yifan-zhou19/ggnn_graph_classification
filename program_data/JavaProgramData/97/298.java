package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int p;
		int q;
		int s;
		int t;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 100;
		p = n - a * 100;
		b = p / 50;
		q = p - b * 50;
		c = q / 20;
		s = q - c * 20;
		d = s / 10;
		t = s - d * 10;
		e = t / 5;
		u = t - e * 5;
		f = u;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",a,b,c,d,e,f);
	}


}

