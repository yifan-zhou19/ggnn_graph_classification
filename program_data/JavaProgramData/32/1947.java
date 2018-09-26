package <missing>;

public class GlobalMembers
{
	public static int trans(String str, int[] a)
	{
		int l = (int)str.length();
		int i;
		for (i = 0;i < l;i++)
		{
			a[l - i - 1] = str[i] - '0';
		}
		return l;
	}

	public static void print(int[] a, int l)
	{
		int k = l - 1;
		int i;
		while (a[k] == 0 && k > 0)
		{
			k--;
		}
		for (i = k;i >= 0;i--)
		{
			System.out.printf("%d",a[i]);
		}
	}

	public static int minus(int[] a, int al, int[] b, int bl, int[] c)
	{
		int i;
		for (i = 0;i < al;i++)
		{
			c[i] = a[i];
			if (i < bl)
			{
				c[i] = c[i] - b[i];
			}
		}
		for (i = 0;i < al;i++)
		{
			if (c[i] < 0)
			{
			c[i + 1]--;
			c[i] = c[i] + 10;
			}
		}
		return al;
	}

	public static int Main()
	{
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int al;
		int bl;
		int cl;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
			al = trans(s1, a);
			bl = trans(s2, b);
			cl = minus(a, al, b, bl, c);
			print(c, cl);
			System.out.print("\n");
		}

		return 0;
	}


}

