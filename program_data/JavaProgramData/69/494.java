package <missing>;

public class GlobalMembers
{
	public static String p = new String(new char[1001]);
	public static String q = new String(new char[1001]);
	public static int Main()
	{
		int j;
		int k;
		int n;
		int m;
		String a;
		String b;
		p = ConsoleInput.readToWhiteSpace(true).charAt(0);
		q = ConsoleInput.readToWhiteSpace(true).charAt(0);
		if (p.length() < q.length()) //?a???????
		{
			a = q;
			b = p;
		}
		else
		{
			a = p;
			b = q;
		}
		n = a.length() - 1;
		m = b.length() - 1;
		for (j = n, k = m; k >= 0; --j, --k)
		{
			a.charAt(j) += b.charAt(k) - '0';
		}
		for (j = n; j != 0; --j) //????
		{
			a.charAt(j - 1) += (a.charAt(j) - '0') / 10;
			a.charAt(j) = (a.charAt(j) - '0') % 10 + '0';
		}
		if (a.charAt(0) > '9') //???????
		{
			System.out.print(1);
			a.charAt(0) -= 10;
		}
		else
		{
			while (a.length() != 1 && a.charAt(0) == '0')
			{
				++a;
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}

