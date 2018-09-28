package <missing>;

public class GlobalMembers
{
	public static int bigint1(tangible.RefObject<String> str, int[] a)
	{
		int len = str.argValue.intValue().length();
		int i;
		for (i = 0;i < len;i++)
		{
			a[len - i - 1] = str.argValue.charAt(i) - '0';
		}
		return len;
	}

	public static void bigint2(int[] a, int len)
	{
		int k = len - 1;
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

	public static int bigint3(int[] a, int alen, int[] b, int blen, int[] c)
	{
		int i;
		for (i = 0;i < alen;i++)
		{
			c[i] = a[i];
			if (i < blen)
			{
				c[i] -= b[i];
			}
		}
		for (i = 0;i < alen;i++)
		{
			if (c[i] < 0)
			{
				c[i + 1]--;
				c[i] += 10;
			}
		}
		return c[alen - 1]?alen:(alen - 1);
	}

	public static void Main(String[] args)
	{
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		int[] a = new int[300];
		int[] b = new int[300];
		int[] c = new int[300];
		int alen;
		int blen;
		int clen;
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
		tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
			alen = bigint1(tempRef_s1, a);
			s1 = tempRef_s1.argValue;
		tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s2);
			blen = bigint1(tempRef_s2, b);
			s2 = tempRef_s2.argValue;
			clen = bigint3(a, alen, b, blen, c);
			bigint2(c, clen);
			System.out.print("\n");
		}
	}

}

