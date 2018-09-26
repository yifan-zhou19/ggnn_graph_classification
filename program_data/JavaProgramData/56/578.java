package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] a = new int[5];
		int[] b = new int[4];
		int[] c = new int[3];
		int[] d = new int[2];
		int n1;
		int n2;
		int n3;
		int n4;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n / 10000 != 0)
		{
			a[0] = n / 10000;
		a[1] = (n - a[0] * 10000) / 1000;
		a[2] = (n - a[0] * 10000 - a[1] * 1000) / 100;
		a[3] = (n - a[0] * 10000 - a[1] * 1000 - a[2] * 100) / 10;
		a[4] = n - a[0] * 10000 - a[1] * 1000 - a[2] * 100 - a[3] * 10;
		n1 = a[4] * 10000 + a[3] * 1000 + a[2] * 100 + a[1] * 10 + a[0];
		System.out.printf("%d\n",n1);
		}
		if (n / 10000 == 0 && n / 1000 != 0)
		{
			b[0] = n / 1000;
		b[1] = (n - b[0] * 1000) / 100;
		b[2] = (n - b[0] * 1000 - b[1] * 100) / 10;
		b[3] = n - b[0] * 1000 - b[1] * 100 - b[2] * 10;
		n2 = b[3] * 1000 + b[2] * 100 + b[1] * 10 + b[0];
		System.out.printf("%d\n",n2);
		}
		if (n / 10000 == 0 && n / 1000 == 0 && n / 100 != 0)
		{
			c[0] = n / 100;
		c[1] = (n - c[0] * 100) / 10;
		c[2] = n - c[0] * 100 - c[1] * 10;
		n3 = c[2] * 100 + c[1] * 10 + c[0];
		System.out.printf("%d\n",n3);
		}
		if (n / 10000 == 0 && n / 1000 == 0 && n / 100 == 0 && n / 10 != 0)
		{
			d[0] = n / 10;
		d[1] = n - d[0] * 10;
		n4 = d[1] * 10 + d[0];
		System.out.printf("%d\n",n4);
		}
		if (n / 10000 == 0 && n / 1000 == 0 && n / 100 == 0 && n / 10 == 0)
		{
			System.out.printf("%d\n",n);
		}
	}
}

