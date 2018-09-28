package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int str2 = new int(char * str,int * a);
		int add = new int(int * a,int al,int * b,int bl,int * c);
		int print = new int(int * c,int l);
		String s1 = new String(new char[max]);
		String s2 = new String(new char[max]);
		int[] a = new int[max];
		int[] b = new int[max];
		int[] c = new int[max];
		int al;
		int bl;
		int cl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
		al = str2(tempRef_s1, a);
		s1 = tempRef_s1.argValue;
	tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s2);
		bl = str2(tempRef_s2, b);
		s2 = tempRef_s2.argValue;
		cl = add(a, al, b, bl, c);
		print(c, cl);

	}
	public static int str2(tangible.RefObject<String> str, int[] a)
	{
		int i;
		int l;
		l = str.argValue.length();
		for (i = 0;i < l;i++)
		{
			a[l - i - 1] = str.argValue.charAt(i) - '0';
		}
		return l;
	}
	public static int add(int[] a, int al, int[] b, int bl, int[] c)
	{
		int l = (al > bl)? al:bl;
		int i;
		for (i = 0;i < l;i++)
		{
			c[i] = 0;
			if (i < al)
			{
				c[i] += a[i];
			}
			if (i < bl)
			{
				c[i] += b[i];
			}
		}
		c[l] = 0;
		for (i = 0;i < l;i++)
		{
			if (c[i] >= 10)
			{
			   c[i + 1] += c[i] / 10;
			   c[i] = c[i] % 10;
			}
		}
		if (c[l] != 0)
		{
		return l + 1;
		}
		else
		{
		return l;
		}
	}
	public static int print(int[] c, int l)
	{
		int i;
		int k;
		k = l - 1;
		while (c[k] == 0 && k > 0)
		{
			  k--;
		}
		for (i = k;i >= 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
	}



}

