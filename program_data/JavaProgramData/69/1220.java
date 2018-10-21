package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[100001]);
	public static int[] a = new int[100001];
	public static int[] b = new int[100001];
	public static int[] c = new int[100001];
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m = 0;
		int alen;
		int blen;
		int clen;
		s = new Scanner(System.in).nextLine();
		alen = s.length();
		for (i = alen - 1;i >= 0;i--)
		{
			 a[alen - i] = s.charAt(i) - '0'; //?????????????
		}
		s = new Scanner(System.in).nextLine();
		blen = s.length();
		for (i = blen - 1;i >= 0;i--)
		{
			 b[blen - i] = s.charAt(i) - '0'; //?????????????
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
				c[i] -= 10;
				if (i == clen)
				{
					clen++; //????
				}
			}
		}
		for (i = clen;i >= 1;i--)
		{
			if (c[i] != 0)
			{
				m = i;
				break;
			}
		}
		if (m == 0)
		{
			for (i = clen;i >= 1;i--)
			{
				System.out.printf("%d",c[i]);
			}
		}
		if (m != 0)
		{
			for (i = m;i >= 1;i--)
			{
				System.out.printf("%d",c[i]);
			}
		}
		System.out.print("\n");
	}

}
