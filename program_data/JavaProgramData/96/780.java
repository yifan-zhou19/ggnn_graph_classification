package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String integral = new String(new char[120]);
		String divide = new String(new char[120]);
		int mod;
		int i;
		int int1;
		int int2;
		int len;
		int lendivide;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			integral = tempVar.charAt(0);
		}
		len = integral.length();
		int1 = (int)(integral.charAt(0) - '0');
		int2 = (int)(integral.charAt(1) - '0');
		if (len == 1)
		{
			System.out.print("0\n");
			System.out.printf("%d\n",int1);
		}
		if (len == 2 && int1 * 10 + int2 < 13)
		{
			System.out.print("0\n");
			System.out.printf("%d\n",int1 * 10 + int2);
		}
		if ((len == 2 && int1 * 10 + int2 >= 13) || (len > 2))
		{
		lendivide = ((int1 * 10 + int2) < 13)? len - 2:len - 1;
		if (lendivide == len - 1)
		{
			for (i = 0;i < lendivide;i++)
			{
				if (i == 0)
				{
					divide = tangible.StringFunctions.changeCharacter(divide, i, (char)(((int)(integral.charAt(i) - '0') * 10 + (int)(integral.charAt(i + 1) - '0')) / 13 + 48));
					mod = ((int)(integral.charAt(i) - '0') * 10 + (int)(integral.charAt(i + 1) - '0')) % 13;
				}
				else
				{
					divide = tangible.StringFunctions.changeCharacter(divide, i, (char)((mod * 10 + (int)(integral.charAt(i + 1) - '0')) / 13 + 48));
					mod = (mod * 10 + (int)(integral.charAt(i + 1) - '0')) % 13;
				}
			}
		}
		if (lendivide == len - 2 && lendivide != 0)
		{
			for (i = 0;i < lendivide;i++)
			{
				if (i == 0)
				{
					divide = tangible.StringFunctions.changeCharacter(divide, i, (char)(((int)(integral.charAt(i) - '0') * 100 + (int)(integral.charAt(i + 1) - '0') * 10 + (int)(integral.charAt(i + 2) - '0')) / 13 + 48));
					mod = ((int)(integral.charAt(i) - '0') * 100 + (int)(integral.charAt(i + 1) - '0') * 10 + (int)(integral.charAt(i + 2) - '0')) % 13;
				}
				else
				{
					divide = tangible.StringFunctions.changeCharacter(divide, i, (char)((mod * 10 + (int)(integral.charAt(i + 2) - '0')) / 13 + 48));
					mod = (mod * 10 + (int)(integral.charAt(i + 2) - '0')) % 13;
				}
			}
		}
		divide = tangible.StringFunctions.changeCharacter(divide, lendivide, '\0');
		System.out.printf("%s\n",divide);
		System.out.printf("%d\n",mod);
		}
		return 0;
	}
}

