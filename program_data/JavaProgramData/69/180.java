package <missing>;

public class GlobalMembers
{
	public static void plus(tangible.RefObject<String> a, tangible.RefObject<String> b, tangible.RefObject<String> c)
	{
		char temp;
		int lena;
		int lenb;
		int i;
		int j;
		int k;
		lena = a.argValue.length();
		lenb = b.argValue.length();
		for (i = 0;i < lena && i < lenb;i++)
		{
			c.argValue.charAt(i) += a.argValue.charAt(lena - 1 - i) + b.argValue.charAt(lenb - 1 - i) - '0';
			if (c.argValue.charAt(i) > '9')
			{
				c.argValue.charAt(i + 1)++;
				c.argValue.charAt(i) -= 10;
			}
		}
		if (lena > lenb)
		{
			for (i = lenb;i < lena;i++)
			{
				c.argValue.charAt(i) += a.argValue.charAt(lena - 1 - i);
			if (c.argValue.charAt(i) > '9')
			{
				c.argValue.charAt(i + 1)++;
				c.argValue.charAt(i) -= 10;
			}
			}
		}
		else if (lena < lenb)
		{
			for (i = lena;i < lenb;i++)
			{
				c.argValue.charAt(i) += b.argValue.charAt(lenb - 1 - i);
			if (c.argValue.charAt(i) > '9')
			{
				c.argValue.charAt(i + 1)++;
				c.argValue.charAt(i) -= 10;
			}
			}
		}
		c.argValue.charAt(i) += '0';
		while (c.argValue.charAt(i) == '0' && i > 0)
		{
		i--;
		}
		c.argValue.charAt(i + 1) = '\0';
		for (j = 0,k = i;j < k;j++,k--)
		{
		   temp = c.argValue.charAt(k);
		   c.argValue.charAt(k) = c.argValue.charAt(j);
		   c.argValue.charAt(j) = temp;
		}
	}
	public static int Main()
	{
		String a = new String(new char[N]);
		String b = new String(new char[N]);
		String c = new String(new char[N]);
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Character.SIZE / Byte.SIZE));
	tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
	tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
	tangible.RefObject<String> tempRef_c = new tangible.RefObject<String>(c);
		plus(tempRef_a, tempRef_b, tempRef_c);
		c = tempRef_c.argValue;
		b = tempRef_b.argValue;
		a = tempRef_a.argValue;
		System.out.printf("%s",c);
	}
}

