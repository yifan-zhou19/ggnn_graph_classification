package <missing>;

public class GlobalMembers
{
	public static int f(String r, int[] x)
	{
		int n;
		int i;
		int j;
		int e = 0;
		n = r.length();
		for (i = 0;i < n;i++)
		{
			int k = r[i] - 48;
			for (j = 1;j < 4;j++)
			{
				if (!r[i + j].equals(',') && !r[i + j].equals('\0'))
				{
					k = k * 10 + r[i + j] - 48;
				}
				else
				{
					break;
				}
			}
			i = i + j;
			x[e] = k;
			e = e+1;
		}
		return e;
	}
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int q = 1;
		int[] x = new int[1001];
		int[] y = new int[1001];
		int a;
		int b;
		int[] s = new int[1000];
		String r = new String(new char[4000]);
		String c = new String(new char[4000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		n = r.length();
		m = c.length();
		for (i = 0;i < n;i++)
		{
			if (r.charAt(i) == ',')
			{
				q = q + 1;
			}
		}
		a = f(r, x);
		b = f(c, y);
		int max = y[0];
		for (i = 1;i < b;i++)
		{
			if (y[i] > max)
			{
				max = y[i];
			}
		}
		for (i = 0;i < max;i++)
		{
			for (j = 0;j < a;j++)
			{
				if (i + 0.5 > x[j] && i + 0.5 < y[j])
				{
					s[i] = s[i] + 1;
				}
			}
		}
		int max1 = s[0];
		for (i = 1;i < max;i++)
		{
			if (s[i] > max1)
			{
				max1 = s[i];
			}
		}
		System.out.printf("%d %d",q,max1);
	}








}

