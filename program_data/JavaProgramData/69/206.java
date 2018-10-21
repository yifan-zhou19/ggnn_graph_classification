package <missing>;

public class GlobalMembers
{
	public static void add(String a, String b, int x1, int x2, String c)
	{
		int i;
		int j;
		int k;
		for (i = x1 - 1,j = x2 - 1;j >= 0;i--,j--)
		{
			k = a[i] - 48 + b[j] - 48;
			if (k + c[i + 1] > 9)
			{
				c[i + 1] = c[i + 1].Substring(k) - 10;
				c[i] = c[i].Substring(1);
			}
			else
			{
				c[i + 1] = c[i + 1].Substring(k);
			}
		}
		for (;i >= 0;i--)
		{
			if (c[i + 1] + a[i] - 48 < 10 != null)
			{
			c[i + 1] = c[i + 1] + a[i] - 48;
			}
			else
			{
				c[i + 1] = c[i + 1] + a[i + 1] - 58;
				c[i] = c[i].Substring(1);
			}
		}
	}
	public static void Main()
	{
		int i;
		int j = 0;
		int x1;
		int x2;
		int m;
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		final String c = "\0";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		x1 = a.length();
		x2 = b.length();
		if (x1 >= x2)
		{
			m = x1;
		}
		else
		{
			m = x2;
		}
		if (x1 >= x2)
		{
			add(a, b, x1, x2, c);
		}
		else
		{
			add(b, a, x2, x1, c);
		}
		for (i = 0;i < m;i++)
		{
			if (j == 0)
			{
			   if (c.charAt(i) != 0)
			   {
				System.out.printf("%d",c.charAt(i));
				j++;
			   }
			}
			else
			{
				System.out.printf("%d",c.charAt(i));
			}
		}
		System.out.printf("%d\n",c.charAt(m));
	}

}

