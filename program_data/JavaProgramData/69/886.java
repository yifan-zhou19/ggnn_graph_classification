package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */

	public static int change(tangible.RefObject<String> as, int[] a)
	{
		int len;
		int i;
		len = as.argValue.intValue().length();
		for (i = 0;i < len;i++)
		{
		a[len - i - 1] = as.argValue.charAt(i) - '0';
		}
		return len;
	}

	public static void bigprint(int[] a, int len)
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

	public static int add(int[] a, int lena, int[] b, int lenb, int[] c)
	{
		int i;
		int len = (lena > lenb)?lena:lenb;
		for (i = 0;i < len;i++)
		{
			c[i] = 0;
			if (i < lena)
			{
				c[i] += a[i];
			}
			if (i < lenb)
			{
				c[i] += b[i];
			}
		}
		c[len] = 0;
		for (i = 0;i < len;i++)
		{
			if (c[i] >= 10)
			{
			c[i + 1] += c[i] / 10;
			c[i] %= 10;
			}
		}
	return c[len]?(len + 1):len;
	}


	public static void Main()
	{
		int[] a = new int[250];
		int[] b = new int[250];
		int[] c = new int[251];
		int lena;
		int lenb;
		int lenc;
		String as = new String(new char[250]);
		String bs = new String(new char[250]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			as = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bs = tempVar2.charAt(0);
		}
	tangible.RefObject<String> tempRef_as = new tangible.RefObject<String>(as);
		lena = change(tempRef_as, a);
		as = tempRef_as.argValue;
	tangible.RefObject<String> tempRef_bs = new tangible.RefObject<String>(bs);
		lenb = change(tempRef_bs, b);
		bs = tempRef_bs.argValue;
		lenc = add(a, lena, b, lenb, c);
	   bigprint(c, lenc);

	}
}

