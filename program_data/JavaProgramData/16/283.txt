package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 10000;
		b = (n - a * 10000) / 1000;
		c = (n % 1000) / 100;
		d = (n % 100) / 10;
		e = n % 10;
		if (a != 0)
		{
			System.out.print("00001\n");
		}
		else if (b != 0)
		{
			if (e != 0)
			{
		System.out.printf("%d\n",e * 1000 + d * 100 + c * 10 + b);
			}
		else if (d != 0)
		{
			System.out.printf("0%d\n",d * 100 + c * 10 + b);
		}
		else if (c != 0)
		{
			System.out.printf("00%d\n",c * 10 + b);
		}
		else
		{
			System.out.printf("000%d\n",b);
		}
		}
		else if (c != 0)
		{
			if (e != 0)
			{
		System.out.printf("%d\n",e * 100 + d * 10 + c);
			}
		else if (d != 0)
		{
			System.out.printf("0%d\n",d * 10 + c);
		}
		else
		{
			System.out.printf("00%d\n",c);
		}
		}
		else if (d != 0)
		{
			if (e != 0)
			{
		System.out.printf("%d\n",e * 10 + d);
			}
		else
		{
			System.out.printf("0%d\n",d);
		}
		}
		else
		{
			System.out.printf("%d\n",n);
		}
		return 0;
	}












}

