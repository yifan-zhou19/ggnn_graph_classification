package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int p;
		int q;
		int r;
		int i;
		int j;
		int k;
		int sum;
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
		String tempVar4 = ConsoleInput.scanfRead("\n");
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
		p = (d - a) * 365;
		q = (b - 1) * 30 + c;
		r = (e-1) * 30 + f;
		i = a;
		while (i < d)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				p = p + 1;
				i = i + 1;
			}
			else
			{
				i = i + 1;
			}
		}
		j = 1;
		k = 1;
		while (j < b)
		{
			if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10) || (j == 12))
			{
				q = q + 1;
				j = j + 1;
			}
			else if (j == 2)
			{
				q = q - 2;
				j = j + 1;
			}
			else
			{
				j = j + 1;
			}
		}
		while (k < e)
		{
			if ((k == 1) || (k == 3) || (k == 5) || (k == 7) || (k == 8) || (k == 10) || (k == 12))
			{
				r = r + 1;
				k = k + 1;
			}
			else if (k == 2)
			{
				r = r - 2;
				k = k + 1;
			}
			else
			{
				k = k + 1;
			}
		}
		if (((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0)) && (e > 2))
		{
			r = r + 1;
		}
		else
		{
			r = r + 0;
		}
		sum = p - q + r;
		System.out.printf("%d",sum);
		return 0;
	}
}

