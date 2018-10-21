package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] c = new int[300];
		int[] aa = new int[300];
		int[] bb = new int[300];
		int i;
		int la;
		int lb;
		int l;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		la = a.length();
		lb = b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(aa,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(bb,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < la;i++)
		{
		aa[i] = a.charAt(la - i - 1) - '0';
		}

		for (i = 0;i < lb;i++)
		{
		bb[i] = b.charAt(lb - i - 1) - '0';
		}

		l = la;
		if (lb > l)
		{
			l = lb;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < l;i++)
		{
		c[i] = aa[i] + bb[i];
		}

		for (i = 0;i < l;i++)
		{
		if (c[i] >= 10)
		{
			c[i] -= 10;
			c[i + 1]++;
		}
		}
		if (c[l] > 0)
		{
			l++;
		}
		while ((c[l - 1] == 0) && (l > 1))
		{
			l--;
		}
		for (i = l - 1;i >= 0;i--)
		{
		System.out.print(c[i]);
		}
	}
}

