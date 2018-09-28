package <missing>;

public class GlobalMembers
{
	public static int[] m = new int[100000];
	public static int come(int c,int s)
	{
		int a;
		int b = 1;
		int d;
		int e;
		int f;
		int g;
		if ((c / 10) == 0 && s >= 2)
		{
			return (0);
		}
		else if ((c / 10) == 0 || (((c / 10) - (c % 10)) == 0 && s == 2))
		{
			return (1);
		}
		else
		{
			for (a = 1;a < s;a++)
			{
				b *= 10;
			}
			d = c / b;
			e = c % 10;
		if (d != e)
		{
			return (0);
		}
		else
		{
			f = c / 10 - d * b / 10;
			return (come(f, (s - 2)));
		}
		}
	}
	public static int go(int c,int q)
	{
		int a;
		for (a = 3;a < q;a = a + 2)
		{
			if ((c % a) == 0)
			{
			return (0);
			}
		}
		return (1);
	}
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int n = 0;
		int i;
		int j;
		int p;
		int q;
		int s;
		int t;
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
		a = (a / 2) * 2 + 1;
		for (c = a;c <= b;c = c + 2)
		{
			q = Math.sqrt(c) + 1;
		i = go(c, q);
		if (i == 0)
		{
			continue;
		}
		else
		{
			s = 1;
			t = c;
			while ((t / 10) != 0)
			{
				t = t / 10;
				s++;
			}
			j = come(c, s);
		if (j == 1)
		{
			m[n] = c;
			n++;
		}
		}
		}
		if (n == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%ld",m[0]);
		for (p = 1;p < n;p++)
		{
			System.out.printf(",%ld",m[p]);
		}
		}
	}

}

