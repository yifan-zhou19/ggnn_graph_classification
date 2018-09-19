package <missing>;

public class GlobalMembers
{
	public static String A = new String(new char[100]);
	public static String a = new String(new char[100]);
	public static int i;
	public static int j = 0;
	public static int m;
	public static int k;
	public static int Main()
	{
		void pipei1(char x);
		void pipei2(char x);
		int n;
		while (gets(a))
		{
			i = 0;
			m = 0;
			k = a.length();
			if (k == 0)
			{
				break;
			}
			for (n = 0;n < k;n++)
			{
				A = tangible.StringFunctions.changeCharacter(A, n, ' ');
				System.out.print(a.charAt(n));
			}
			pipei1(a.charAt(j));
			pipei2(a.charAt(j));
			System.out.print("\n");
			for (n = 0;n < k;n++)
			{
				System.out.print(A.charAt(n));
			}
			System.out.print("\n");
		}

		return 0;
	}
	public static void pipei1(char x)
	{
		if (j < k)
		{
			if (i < 0)
			{
				i = 0;
			}
			if (x == '(')
			{
				i++;
			}
			else if (x == ')')
			{
				if (i == 0)
				{
					A = tangible.StringFunctions.changeCharacter(A, j, '?');
				}
				i--;
			}
			j++;
			pipei1(a.charAt(j));
		}
	}
	public static void pipei2(char x)
	{
		if (j >= 0)
		{
			if (m < 0)
			{
				m = 0;
			}
			if (x == ')')
			{
				m++;
			}
			else if (x == '(')
			{
				if (m == 0)
				{
					A = tangible.StringFunctions.changeCharacter(A, j, '$');
				}
				m--;
			}
			j--;
			pipei2(a.charAt(j));
		}
	}



}

