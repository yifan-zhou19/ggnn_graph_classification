package <missing>;

public class GlobalMembers
{
	public static void f(String c, int i)
	{
		int j;
		int k;
		for (j = 0;j < i;j++)
		{
			for (k = 0;k < i - j;k++)
			{
				if (c[k].compareTo(c[k + 1]) > 0)
				{
					char s;
					s = c[k];
					c[k] = c[k + 1];
					c[k + 1] = s;
				}
			}
		}
	}
	public static int Main()
	{
		String s = new String(new char[1000]);
		String c = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		int lens;
		int lenc;
		lens = s.length();
		lenc = c.length();
		int i;
		int j;
		int k;
		if (lens != lenc)
		{
			System.out.print("NO");
		}
		else
		{
			f(s, lens);
			f(c, lenc);
			for (k = 0;k < lens;k++)
			{
				if (s.charAt(k) != c.charAt(k))
				{
					System.out.print("NO");
					break;
				}
			}
			if (k == lens)
			{
				System.out.print("YES");
			}
		}
	}



}

