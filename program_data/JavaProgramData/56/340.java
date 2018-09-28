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
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 10000;
		b = (n - a * 10000) / 1000;
		c = (n - a * 10000 - b * 1000) / 100;
		d = (n - a * 10000 - b * 1000 - c * 100) / 10;
		e = (n - a * 10000 - b * 1000 - c * 100 - d * 10) / 1;
		if (a != 0)
		{
			m = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
			System.out.printf("%d\n",m);
		}
		if (a == 0 && b != 0)
		{
			m = e * 1000 + d * 100 + c * 10 + b * 1;
		   System.out.printf("%d\n",m);
		}
		if (a == 0 && b == 0 && c != 0)
		{
			  m = e * 100 + d * 10 + c * 1;
			  System.out.printf("%d\n",m);
		}
		if (a == 0 && b == 0 && c == 0 && d != 0)
		{
			   m = e * 10 + d * 1;
			   System.out.printf("%d\n",m);
		}
		if (a == 0 && b == 0 && c == 0 && d == 0 && e != 0)
		{
				  m = e;
				  System.out.printf("%d\n",m);
		}

	}


}

