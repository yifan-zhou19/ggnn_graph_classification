package <missing>;

public class GlobalMembers
{
		public static int Main()
		{

		int a;
		int b;
		int c;
		int d;
		void f(int x);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		f(a);
		f(b);
		f(c);
		f(d);
		return 0;
		}


	public static void f(int x)
	{
		int y = 0;
		while (x > 9)
		{
		  y = (y + x - x / 10 * 10) * 10;
		  x /= 10;
		}
			y += x;
		System.out.printf("%d\n",y);
	}
}

