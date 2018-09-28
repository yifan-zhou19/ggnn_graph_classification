package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sum = Integer.parseInt(tempVar);
		}
		while (sum > 0)
		{
			sum -= 100;
			a++;
		}
		if (sum != 0)
		{
		sum += 100;
		a -= 1;
		}
		while (sum > 0)
		{
			sum -= 50;
			b++;
		}
		if (sum != 0)
		{
		sum += 50;
		b -= 1;
		}
		while (sum > 0)
		{
			sum -= 20;
			c++;
		}
			if (sum != 0)
			{
		sum += 20;
		c -= 1;
			}
		while (sum > 0)
		{
			sum -= 10;
			d++;
		}
		if (sum != 0)
		{
		sum += 10;
		d -= 1;
		}
		while (sum > 0)
		{
			sum -= 5;
			e++;
		}
		if (sum != 0)
		{
		sum += 5;
		e -= 1;
		}
		while (sum > 0)
		{
			sum -= 1;
			f++;
		}
		System.out.printf("%d\n",a);
		System.out.printf("%d\n",b);
		System.out.printf("%d\n",c);
		System.out.printf("%d\n",d);
		System.out.printf("%d\n",e);
		System.out.printf("%d\n",f);
		return 0;
	}

}

