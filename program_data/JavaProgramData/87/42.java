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
		int s;
		int a1;
		int b1;
		int c1;
		int d1;
		int e1;
		int f1;
		int s1;
		while (true)
		{
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				e = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				f = Integer.parseInt(tempVar6);
			}
		if ((a * a + b * b + c * c + d * d + e * e + f * f) != 0)
		{
			a1 = a;
		b1 = b;
		c1 = c;
		d1 = d;
		e1 = e;
		f1 = f;
		}
		else
		{
			break;
		}
		s = (d1 - a1 + 12) * 3600 + (e1 - b1) * 60 + (f1 - c1);
		System.out.printf("%d\n",s);
		}
		return 0;
	}
}

