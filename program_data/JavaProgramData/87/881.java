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
		while ((a != 0) || (b != 0) || (c != 0) || (d != 0) || (e != 0) || (f != 0))
		{
			if (f >= c)
			{
				s = f - c;
				if (e >= b)
				{
					s += (e - b) * 60;
					s += (d + 12 - a) * 60 * 60;
				}
				else
				{
					s += (e+60 - b) * 60;
					s += (d + 11 - a) * 60 * 60;
				}
			}
			else
			{
				s = f - c + 60;
				if ((e-1) >= b)
				{
					s += (e - b - 1) * 60;
					s += (d + 12 - a) * 60 * 60;
				}
				else
				{
					 s += (e+60 - b - 1) * 60;
					 s += (d + 11 - a) * 60 * 60;
				}
			}
			System.out.printf("%d\n",s);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				a = Integer.parseInt(tempVar7);
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				b = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead();
			if (tempVar9 != null)
			{
				c = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				d = Integer.parseInt(tempVar10);
			}
			String tempVar11 = ConsoleInput.scanfRead();
			if (tempVar11 != null)
			{
				e = Integer.parseInt(tempVar11);
			}
			String tempVar12 = ConsoleInput.scanfRead();
			if (tempVar12 != null)
			{
				f = Integer.parseInt(tempVar12);
			}
		}
		return 0;
	}

}

