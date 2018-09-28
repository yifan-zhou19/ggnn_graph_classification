package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;

		while (a >= 100)
		{
			a = a - 100;
			b = b++;
		}
		while (a >= 50)
		{
			a = a - 50;
			c = c++;
		}
		while (a >= 20)
		{
			a = a - 20;
			d = d++;
		}
		while (a >= 10)
		{
			a = a - 10;
			e = e++;
		}
		while (a >= 5)
		{
			a = a - 5;
			f = f++;
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,c,d,e,f,a);
		return 0;





	}
}

