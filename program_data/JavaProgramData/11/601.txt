package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int i;
		int j;
		int k;
		int l;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			A = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			B = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			C = Integer.parseInt(tempVar3);
		}
		a = 31;
		if ((A % 4 == 0 && A % 100 != 0) || A % 400 == 0)
		{
				b = 29;
		}
		else
		{
			b = 28;
		}
		c = 31;
		d = 30;
		e = 31;
		f = 30;
		g = 31;
		h = 31;
		i = 30;
		j = 31;
		k = 30;
		l = 31;
		if (B == 1)
		{
			m = C;
		}
		if (B == 2)
		{
			m = C + a;
		}
		if (B == 3)
		{
			m = C + a + b;
		}
		if (B == 4)
		{
			m = C + a + b + c;
		}
		if (B == 5)
		{
			m = C + a + b + c + d;
		}
		if (B == 6)
		{
			m = C + a + b + c + d + e;
		}
		if (B == 7)
		{
			m = C + a + b + c + d + e + f;
		}
		if (B == 8)
		{
			m = C + a + b + c + d + e + f + g;
		}
		if (B == 9)
		{
			m = C + a + b + c + d + e + f + g + h;
		}
		if (B == 10)
		{
			m = C + a + b + c + d + e + f + g + h + i;
		}
		if (B == 11)
		{
			m = C + a + b + c + d + e + f + g + h + i + j;
		}
		if (B == 12)
		{
			m = C + a + b + c + d + e + f + g + h + i + j + k;
		}
		System.out.printf("%d\n",m);
		return 0;
	}
}

