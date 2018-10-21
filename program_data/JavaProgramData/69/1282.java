package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[260]);
		String b = new String(new char[260]);
		String tmp = new String(new char[260]);
		int i;
		int j;
		for (i = 0;i < 260;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		tmp = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int lena = tmp.length();
		for (j = 0;j < lena;j++)
		{
			if (tmp.charAt(j) != '0')
			{
				break;
			}
		}
		for (i = j;i < lena;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i - j, tmp.charAt(lena - (i - j) - 1));
		}
		tmp = ConsoleInput.readToWhiteSpace(true).charAt(0);
		lena -= j;
		int lenb = tmp.length();
		for (j = 0;j < lenb;j++)
		{
			if (tmp.charAt(j) != '0')
			{
				break;
			}
		}
		for (i = j;i < lenb;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i - j, tmp.charAt(lenb - (i - j) - 1));
		}
		lenb -= j;


		int c = 0;
		int len = lena > lenb != 0 ? lena : lenb;
		for (i = 0;i < 260;i++)
		{
			if (a.charAt(i) - '0' + b.charAt(i) - '0' + c > 9)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0' + b.charAt(i) - '0' + c - 10 + '0');
				c = 1;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0' + b.charAt(i) - '0' + c + '0');
				c = 0;
			}
		}

		if (lena == 0 && lenb == 0)
		{
			System.out.print(0);
		}
		else
		{
		if (a.charAt(len) > '0')
		{
			System.out.print(a.charAt(len));
		}
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(a.charAt(i));
		}
		}
		System.out.print("\n");
		return 0;
	}
}

