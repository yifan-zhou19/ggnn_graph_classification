package <missing>;

public class GlobalMembers
{
	public static String p = new String(new char[1001]);
	public static String q = new String(new char[1001]);
	public static int j;
	public static int k;
	public static int n;
	public static int m;
	public static String a;
	public static String b;
	public static void cal()
	{
		for (j = n, k = m; k >= 0; --j, --k)
		{
			a.charAt(j) += b.charAt(k) - '0';
		}
		for (j = n; j != 0; --j) //????
		{
			a.charAt(j - 1) += (a.charAt(j) - '0') / 10;
			a = tangible.StringFunctions.changeCharacter(a, j, (a.charAt(j) - '0') % 10 + '0');
		}
		return;
	}
	public static int Main()
	{
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
		cal();
		if (a.charAt(0) > '9') //???????
		{
			System.out.print(1);
			a.charAt(0) -= 10;
		}
		else //????????
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

