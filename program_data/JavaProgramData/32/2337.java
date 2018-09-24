package <missing>;

public class GlobalMembers
{
	public static void func(String u, String v)
	{
		final String w = "0";
		char[] copy = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int m;
		int n;
		int p;
		int q;
		int i;
		int j;
		int k;
		int t;
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int[] d = new int[101];
		k = 0;
		m = 0;
		n = 0;
		i = u.length();
		for (p = i;p >= 1;p--)
		{
			u[p] = u[p - 1];
		}
		u[0] = 48;
		j = v.length();
		for (q = j;q >= 1;q--)
		{
			v[q] = v[q - 1];
		}
		v[0] = 48;
		for (p = 0;p <= i;p++)
		{
			a[p] = u[p] - 48;
		}
		for (q = 0;q <= j;q++)
		{
			b[q] = v[q] - 48;
		}
		for (q = 1;q <= j;q++)
		{
			d[q] = 9 - b[q];
		}
		for (q = j,p = i;q >= 0;q = q - 1,p = p - 1)
		{
			c[p] = (a[p] + d[q] + k) % 10;
			k = (a[p] + d[q] + k) / 10;
		}
		for (;p >= 0;p = p - 1)
		{
			c[p] = (a[p] + k) % 10;
			k = (a[p] + k) / 10;
		}
		for (t = i;t >= 1;t = t - 1)
		{
			c[t] = (c[t] + 1) % 10;
			if (c[t] != 0)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto yes;
			}
		}
		c[0] = c[0] + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	yes:
	for (t = i - j;t >= 0;t = t - 1)
	{
			c[t] = c[t] - 1;
			if (c[t] != -1)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto diong;
			}
			else
			{
				c[t] = 9;
			}
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	diong:
	for (p = 0;p <= i;p++)
	{
		w = tangible.StringFunctions.changeCharacter(w, p, c[p] + 48);
	}
			while (w.charAt(0) == 48)
			{
				for (p = 0;p <= i;p++)
				{
					w = tangible.StringFunctions.changeCharacter(w, p, w.charAt(p + 1));
				}
			}
			System.out.printf("%s\n",w);
	}
	public static void Main()
	{
		char[][] u = new char[100][101];
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m <= 2 * n - 2;m = m + 2)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				u[m] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				u[m + 1] = tempVar3.charAt(0);
			}
			System.out.print("\n");
		}
		for (m = 0;m <= 2 * n - 2;m = m + 2)
		{
			func(u[m], u[m + 1]);
		}
	}

}

