package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		int m;
		String a = new String(new char[103]);
		String c = new String(new char[103]);
		String d = new String(new char[2]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		if (n == 1)
		{
			System.out.printf("0\n%c",a.charAt(0));
		}
		else if (n == 2 && ((a.charAt(0) - 48) * 10 + a.charAt(1) - 48 < 13))
		{
			System.out.print("0\n");
			System.out.printf("%c%c",a.charAt(0),a.charAt(1));
		}
		else if ((n > 3) || (n == 2 && ((a.charAt(0) - 48) * 10 + a.charAt(1) - 48 > 13)))
		{
			for (i = 0;i < n - 1;i++)
			{
				if (i == 0)
				{
					m = a.charAt(i) - 48;
					c = tangible.StringFunctions.changeCharacter(c, i, '0');
				}
				k = m * 10 + (a.charAt(i + 1) - 48);
				if (k >= 13)
				{
					c = tangible.StringFunctions.changeCharacter(c, i + 1, k / 13 + 48);
					m = k % 13;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, i + 1, '0');
					m = k;
				}
			}
			if (m > 9)
			{
				d = tangible.StringFunctions.changeCharacter(d, 0, '1');
				d = tangible.StringFunctions.changeCharacter(d, 1, m - 10 + 48);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, 0, m + 48);
				d = tangible.StringFunctions.changeCharacter(d, 1, '\0');
			}
			for (i = 0;i < n;i++)
			{
				if (c.charAt(i) != '0')
				{
					j = i;
					break;
				}
			}
			for (i = j;i < n;i++)
			{
				System.out.printf("%c",c.charAt(i));
			}
			System.out.print("\n");
			System.out.println(d);
		}
		return 0;
	}
}

