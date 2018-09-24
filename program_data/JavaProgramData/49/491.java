package <missing>;

public class GlobalMembers
{
	public static int jichuan(int x, String s, int[] b, int l)
	{
		int p;
		int q;
		int t;
		int i;
		int j;
		for (p = x, q = l - x, t = 0, i = p ; i <= q ; i++)
		{
			if ((b[i]) && (s[i - x].equals(s[i + x])))
			{
					   for (j = i - x ; j <= i + x ; j++)
					   {
						   System.out.print(s[j]);
					   }
					   System.out.print("\n");
					   t++;
			}
			else
			{
					   b[i] = 0;
			}
		}
		return t;
	}

	public static int ouchuan(int x, String s, int[] a, int l)
	{
		int p;
		int q;
		int t;
		int i;
		int j;
		for (p = x - 1, q = l - x, t = 0, i = p ; i <= q ; i++)
		{
			if ((a[i]) && (s[i - x + 1].equals(s[i + x])))
			{
					   for (j = i - x + 1; j <= i + x ; j++)
					   {
						   System.out.print(s[j]);
					   }
					   System.out.print("\n");
					   t++;
			}
			else
			{
					   a[i] = 0;
			}
		}
		return t;
	}

	public static int Main()
	{
		int[] a = new int[501];
		int[] b = new int[501];
		int l;
		int i;
		int m0;
		int m1;
		int max;
		String s = new String(new char[501]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = s.length() - 1;
		for (i = 0 ; i <= l ; i++)
		{
			a[i] = 1;
			b[i] = 1;
		}
		for (m0 = 1, m1 = 1, max = (l + 1) / 2, i = 1 ; i <= max ; i++)
		{
			if (m0 != 0)
			{
				   m0 = ouchuan(i, s, a, l);
			}
			if (m1 != 0)
			{
				   m1 = jichuan(i, s, b, l);
			}
			if ((m1 == 0) && (m0 == 0))
			{
			   break;
			}
		}
		return 0;
	}

}

