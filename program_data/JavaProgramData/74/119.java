package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huiwen = int;
		int prime = int;
		int[] s = new int[80];
		int a;
		int b;
		int c;
		int d;
		int i;
		int j;
		d = 0,i = 0;
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
		for (c = a;c <= b;c++)
		{
			if (huiwen(c) != 0 && prime(c) != 0)
			{
				d = d + 1;
				s[i++] = c;
			}
			s[i] = '\0';
		}
		if (d == 0)
		{
			System.out.print("no");
		}
		if (d == 1)
		{
			System.out.printf("%d",s[0]);
		}
		if (d >= 2)
		{
			System.out.printf("%d,%d",s[0],s[1]);
			for (j = 2;j < d;j++)
			{
				System.out.printf(",%d",s[j]);
			}
		}
	}


	public static int huiwen(int q)
	{
		int w;
		int e;
		int t;
		int flag;
		e = 0;
		t = q;
		while (q != 0)
		{
			w = q % 10;
			e = e * 10 + w;
			q = q / 10;
		}
		if (e == t)
		{
			flag = 1;
			return (flag);
		}
		else
		{
			flag = 0;
			return (flag);
		}
	}

	public static int prime(int p)
	{
		int g;
		int flag;
		for (g = 2;g <= Math.sqrt(p);g++)
		{
			if (p % g == 0)
			{
				flag = 0;
				return (flag);
			}
		}
			if (g > Math.sqrt(p))
			{
				flag = 1;
				return (flag);
			}
	}

}

