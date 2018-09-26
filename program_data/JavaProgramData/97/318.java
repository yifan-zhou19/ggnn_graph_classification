package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		if ((k / 100) != 0)
		{
		   a = k / 100;
		   k = k - a * 100;
		}
		if ((k / 50) != 0)
		{
			b = k / 50;
			k = k - b * 50;
		}
		if ((k / 20) != 0)
		{
			c = k / 20;
			k = k - c * 20;
		}
		if ((k / 10) != 0)
		{
			d = k / 10;
			k = k - d * 10;
		}
		if ((k / 5) != 0)
		{
			e = k / 5;
			k = k - e * 5;
		}
		if (k != 0)
		{
			f = k;
		}
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
	}


}

