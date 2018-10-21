package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[251]);
		int[] a = new int[251];
		int[] b = new int[251];
		int[] c = new int[252];
		int alen;
		int blen;
		int clen;
		int m;
		int i;
		int k = 0;
		s = new Scanner(System.in).nextLine();
		alen = s.length();
		for (i = alen - 1;i >= 0;i--)
		{
			a[alen - i] = s.charAt(i) - '0';
		}
		s = new Scanner(System.in).nextLine();
		blen = s.length();
		for (i = blen - 1;i >= 0;i--)
		{
			b[blen - i] = s.charAt(i) - '0';
		}
		if (alen > blen)
		{
			clen = alen;
		}
		else
		{
			clen = blen;
		}
		for (i = 1;i <= clen;i++)
		{
			c[i] = a[i] + b[i];
		}
		for (i = 1;i <= clen;i++)
		{
			if (c[i] > 9)
			{
				c[i + 1]++;
				c[i] = c[i] - 10;
				if (i == clen)
				{
					clen++;
				}
			}
		}
		if (clen == 1)
		{
			System.out.printf("%d",c[clen]);
		}
		else
		{
			for (i = clen;i > 0;i--)
			{
				if (c[i] != 0)
				{
					m = i;
					break;
				}
			}
		}
		for (i = m;i > 0;i--)
		{
			System.out.printf("%d",c[i]);
		}
		System.out.print("\n");
		return 0;
	}
}
