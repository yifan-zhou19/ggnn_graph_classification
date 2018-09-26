package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int z;
		int x;
		int c;
		int v;
		int b;
		int n;
		int y;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		z = (a - a % 100) / 100;
		x = (a - 100 * z - (a - 100 * z) % 50) / 50;
		y = a - 100 * z - 50 * x;
		c = (y - y % 20) / 20;
		v = (y - 20 * c - (y - 20 * c) % 10) / 10;
		t = a % 10;
		b = (t - t % 5) / 5;
		n = t - 5 * b;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",z,x,c,v,b,n);
	}

}

