package <missing>;

public class GlobalMembers
{
	public static int f(int a,int b)
	{
		int r1;
		int r2;
		int a2;
		int b2;
		int c;
		r1 = 0;
		r2 = 0;

		a2 = a;
		b2 = b;
		for (;a2 != 0;)
		{
			a2 = a2 / 2;
			r1++;
		}
		for (;b2 != 0;)
		{
			b2 = b2 / 2;
			r2++;
		}
		if (r1 > r2)
		{
			c = Math.pow(2,r1 - r2);
		a = a / c;
		}
		if (r1 < r2)
		{
			c = Math.pow(2,r2 - r1);
		b = b / c;
		}
		for (;;)
		{
			if (a == b)
			{
				System.out.printf("%d",a);
				break;
			}
			a = a / 2;
			b = b / 2;
		}

		return a;

	}



	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		f(a, b);

		return 0;
	}
}

