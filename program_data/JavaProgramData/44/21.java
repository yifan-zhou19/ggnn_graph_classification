package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
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
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		a = reverse(a);
		b = reverse(b);
		c = reverse(c);
		d = reverse(d);
		e = reverse(e);
		f = reverse(f);
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d",a,b,c,d,e,f);
	}
		public static int reverse(int num)
		{
			int w = 0;
			int leap = 0;
			if (num < 0)
			{
				num = 0 - num;
				leap = 1;
			}

			while (num > 0)
			{
				w = num % 10 + 10 * w;
				num /= 10;
			}
			if (leap == 1)
			{
				w = 0 - w;
			}
			return (w);
		}
}

