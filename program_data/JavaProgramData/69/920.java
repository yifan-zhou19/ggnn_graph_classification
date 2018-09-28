package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int afirst;
		int bfirst;
		String a = new String(new char[max]);
		String b = new String(new char[max]);
		String c = new String(new char[max]);
		String A = new String(new char[max]);
		String B = new String(new char[max]);
		for (i = 0;i < max;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '0');
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
			c = tangible.StringFunctions.changeCharacter(c, i, '0');
			A = tangible.StringFunctions.changeCharacter(A, i, '0');
			B = tangible.StringFunctions.changeCharacter(B, i, '0');
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;i < max;i++)
		{
			if (a.charAt(i) == '\0')
			{

				break;
			}

		}
		afirst = i - 1;
		for (i = 0;i < max;i++)
		{
			if (b.charAt(i) == '\0')
			{
				break;
			}
		}
		bfirst = i - 1;
		if (afirst > bfirst)
		{
			n = afirst;
		}
		else
		{
			n = bfirst;
		}
		for (i = afirst,j = 0;i >= 0;i--,j++)
		{
			A = tangible.StringFunctions.changeCharacter(A, n + 1 - j, a.charAt(i));
		}
		for (i = bfirst,j = 0;i >= 0;i--,j++)
		{
			B = tangible.StringFunctions.changeCharacter(B, n + 1 - j, b.charAt(i));
		}
		for (i = n + 1;i >= 1;i--)
		{
			c.charAt(i) += A.charAt(i) + B.charAt(i) - '0'-'0';
			if (c.charAt(i) - '0' >= 10)
			{
				c.charAt(i) -= 10;
				c.charAt(i - 1)++;
			}
		}
		for (i = 0;c.charAt(i) == '0' && i <= n + 1;i++)
		{
			;
		}
		if (i == n + 2)
		{
			System.out.print("0");
		}
		else
		{
				for (;i <= n + 1;i++)
				{
				System.out.printf("%c",c.charAt(i));
				}
		}
		return 0;
	}
}

