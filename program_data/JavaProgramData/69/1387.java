package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		int i;
		int aa;
		int bb;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		aa = a.length(),bb = b.length();
		if (aa > bb)
		{
								for (i = aa - 1;i >= aa - bb;i--)
								{
																		   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - aa + bb));
								}
								for (i = 0;i <= aa - bb - 1;i++)
								{
									b = tangible.StringFunctions.changeCharacter(b, i, '0');
								}
								b = b.substring(0, aa);
		}
		if (aa < bb)
		{
								for (i = bb - 1;i >= bb - aa;i--)
								{
																		   a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - bb + aa));
								}
								for (i = 0;i <= bb - aa - 1;i++)
								{
									a = tangible.StringFunctions.changeCharacter(a, i, '0');
								}
								a = tangible.StringFunctions.changeCharacter(a, bb, '\0');
		}
		if (bb > aa)
		{
			aa = bb;
		}
		//printf("%s\n%s\n", a, b);
		for (i = aa - 1;i >= 0;i--)
		{
									if (a.charAt(i) + b.charAt(i) - 96 <= 9)
									{
										c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + b.charAt(i) - 48);
									}
									if (a.charAt(i) + b.charAt(i) - 96 > 9 && i != 0)
									{
										c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + b.charAt(i) - 58);
										b.charAt(i - 1) += 1;
									}
									if (a.charAt(i) + b.charAt(i) - 96 > 9 && i == 0)
									{
										c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + b.charAt(i) - 48);
									}
		}
		c = tangible.StringFunctions.changeCharacter(c, aa, '\0');
		String cc = c;
		if (c.charAt(0) - 48 > 9)
		{
			System.out.print("1");
			c = tangible.StringFunctions.changeCharacter(c, 0, c.charAt(0) - 10);
		}
		else
		{
			while (cc == '0')
			{
				++cc;
			}
			if (cc == 0)
			{
				--cc;
			}
		}
		System.out.printf("%s\n", cc);
		//while(1);
	}

}

