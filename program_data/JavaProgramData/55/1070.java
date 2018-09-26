package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]); //?a???????b??????
		String b = new String(new char[100]);
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{
			b = b.substring(0, i);
		}
		int n1;
		int n2;
		int m = 0;

		double dn1;


		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int lena = a.length();
		for (i = 0;i < lena;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') //?????????????
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a' + 10);
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A' + 10);
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
			} //????ASCII?????
		}
		for (i = 0;i < lena;i++)
		{
			dn1 = n1;
			m = m + a.charAt(i) * Math.pow(dn1,lena - i - 1); //???????10???
		}

		i = 1;
		do
		{
			b = tangible.StringFunctions.changeCharacter(b, i, m % n2); //?10??????n2???
			m = m / n2;
			i++;
		} while (m != 0);
		int t = i - 1;
		for (j = t;j > 0;j--)
		{
			if (b.charAt(j) >= 0 && b.charAt(j) <= 9) //?b???????????ASCII????
			{
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j) + '0');
			}
			else if (b.charAt(j) >= 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j) - 10 + 'A');
			}
			System.out.print(b.charAt(j));
		}
		System.out.print("\n");
		return 0;
	}
}

