package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String A = new String(new char[250]);
		String B = new String(new char[250]);
		String C = new String(new char[250]);
		char a;
		int l;
		int m;
		int n;
		int q;
		int g = 0;
		A = new Scanner(System.in).nextLine();
		B = new Scanner(System.in).nextLine();
		n = A.length();
		m = B.length();
		for (int i = 0;i < 250;i++)
		{
			C = C.substring(0, i);
		}
		for (int i = 0;i < n;i++)
		{
			A.charAt(i) -= 48;
		}
		for (int i = 0;i < m;i++)
		{
			B.charAt(i) -= 48;
		}
		for (int i = 0;i < n / 2;i++)
		{
			a = A.charAt(i);
			A = tangible.StringFunctions.changeCharacter(A, i, A.charAt(n - i - 1));
			A = tangible.StringFunctions.changeCharacter(A, n - i - 1, a);
		}
		for (int i = 0;i < m / 2;i++)
		{
			a = B.charAt(i);
			B = tangible.StringFunctions.changeCharacter(B, i, B.charAt(m - i - 1));
			B = tangible.StringFunctions.changeCharacter(B, m - i - 1, a);
		}
		l = Math.max(m,n);
		q = Math.min(m,n);
		//cout<<A<<endl;
		//cout<<B<<endl;
		for (int i = 0;i < q;i++)
		{
			C = tangible.StringFunctions.changeCharacter(C, i, A.charAt(i) + B.charAt(i));
		}
		for (int i = q;i < l;i++)
		{
			if (n > m)
			{
			C = tangible.StringFunctions.changeCharacter(C, i, A.charAt(i));
			}
			else if (m > n)
			{
			C = tangible.StringFunctions.changeCharacter(C, i, B.charAt(i));
			}
		}
		for (int i = 0;i < l;i++)
		{
			if (C.charAt(i) > 9)
			{
				C.charAt(i + 1)++;
				C.charAt(i) -= 10;
			}
		}
		if (C.charAt(l) > 0)
		{
			l++;
		}
		for (int i = l - 1;i >= 0;i--)
		{
			if (C.charAt(i) == 0 && g == 0)
			{
				continue;
			}
			if (C.charAt(i) != 0)
			{
				g = 1;
			}
			if (g == 1)
			{
			System.out.print((int)C.charAt(i));
			}
		}
		if (g == 0)
		{
			System.out.print("0");
		}
		return 0;
	}
}

