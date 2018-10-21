package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int changdu1;
		int changdu2;
		int js = 0;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		changdu1 = a.length();
		changdu2 = b.length();
		for (i = 250;i < 500;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 48);
			b = tangible.StringFunctions.changeCharacter(b, i, 48);
		}
		for (i = 0;i < changdu1;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, 500 - changdu1 + i, a.charAt(i));
		}
		for (i = 0;i < changdu2;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, 500 - changdu2 + i, b.charAt(i));
		}

		for (i = 500;i > 249;i--)
		{

			b.charAt(i) += a.charAt(i) - 48;
			if (b.charAt(i) > 57 && b.charAt(i) < 67)
			{
				b.charAt(i - 1)++;
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 10);
			}

		}
		for (i = 250;i < 500;i++)
		{
			if (j != 0 || (b.charAt(i) >= 49 && b.charAt(i) <= 57))
			{
				System.out.printf("%c",b.charAt(i));
				j = 1;
				js++;
			}
		}
		if (js == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");

		return 0;
	}
}

