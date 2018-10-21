package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
			a = k / 100;
			k = k % 100;
			b = k / 50;
			k = k % 50;
			c = k / 20;
			k = k % 20;
			d = k / 10;
			k = k % 10;
			e = k / 5;
			k = k % 5;
			f = k;

		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);

	}
}

