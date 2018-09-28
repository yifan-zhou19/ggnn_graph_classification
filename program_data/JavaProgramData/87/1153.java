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
		int A;
		int B;
		int C;
		int m = 0;
		while (true)
		{
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
		if (a == b && b == c && c == d && d == e && e == f && f == 0)
		{
			break;
		}
		else
		{
		if (c > f)
		{
			C = f + 60 - c;
			if (e-1 <= b)
			{
				B = e-1 + 60 - b;
				A = 11 + d - a;
			}
			else
			{
				B = e-1 - b;
				A = 12 + d - a;
			}
		}
		else if (c <= f)
		{
			C = f - c;
			if (e <= b)
			{
				B = e+60 - b;
				A = 11 + d - a;
			}
			else
			{
				B = e - b;
				A = 12 + d - a;
			}
		}
		m = 3600 * A + 60 * B + C;
		System.out.printf("%d\n",m);
		}
		}
		return 0;
	}
}

