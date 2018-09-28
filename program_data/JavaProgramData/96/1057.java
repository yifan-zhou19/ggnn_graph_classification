package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int al;
		final String c = "013";
		final String cf = "13";
		String a = new String(new char[233]);
		String b = new String(new char[233]);
		String d = new String(new char[233]);
		String e = new String(new char[4]);
		String ef = new String(new char[3]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		al = a.length();
		for (i = 0;i < al;i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, '0');
		}
		b = a;
		d = tangible.StringFunctions.changeCharacter(d, al - 1, '\0');
		e = tangible.StringFunctions.changeCharacter(e, 3, '\0');
		if (al == 1 || (al == 2 && a.charAt(0) == '1' && a.charAt(1) < '3'))
		{
			System.out.printf("0\n%s",a);
		}
		else
		{
		for (i = 0;i < al - 1;i++) //i???
		{
			//????? 
			if (i == 0)
			{
				ef = tangible.StringFunctions.changeCharacter(ef, 0, b.charAt(0));
				ef = tangible.StringFunctions.changeCharacter(ef, 1, b.charAt(1));
				for (j = 0;strcmp(ef,cf) >= 0;j++)
				{

					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 1);
					b = tangible.StringFunctions.changeCharacter(b, i + 1, b.charAt(i + 1) - 3);
					//printf("%s\n",b);
					if (b.charAt(i + 1) < '0')
					{
						b = tangible.StringFunctions.changeCharacter(b, i + 1, b.charAt(i + 1) + 10);
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 1);
					}
				//	printf("%s\n",b);
					ef = tangible.StringFunctions.changeCharacter(ef, 0, b.charAt(0));
					ef = tangible.StringFunctions.changeCharacter(ef, 1, b.charAt(1));

				}
				d = tangible.StringFunctions.changeCharacter(d, 0, j + '0');
			//	printf("%s\n",d);
			}
			else
			{
				e = tangible.StringFunctions.changeCharacter(e, 0, b.charAt(i - 1));
				e = tangible.StringFunctions.changeCharacter(e, 1, b.charAt(i));
				e = tangible.StringFunctions.changeCharacter(e, 2, b.charAt(i + 1));
			//	printf("%s\n",b);
				for (j = 0;strcmp(e,c) >= 0;j++)
				{

					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 1);
					b = tangible.StringFunctions.changeCharacter(b, i + 1, b.charAt(i + 1) - 3);
					if (b.charAt(i + 1) < '0')
					{
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 1);
						b = tangible.StringFunctions.changeCharacter(b, i + 1, b.charAt(i + 1) + 10);
					}
					if (b.charAt(i) < '0')
					{
						b = tangible.StringFunctions.changeCharacter(b, i - 1, b.charAt(i - 1) - 1);
						b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 10);
					}
					e = tangible.StringFunctions.changeCharacter(e, 0, b.charAt(i - 1));
					e = tangible.StringFunctions.changeCharacter(e, 1, b.charAt(i));
					e = tangible.StringFunctions.changeCharacter(e, 2, b.charAt(i + 1));
			//		printf("%s\n",b);
				}
				d = tangible.StringFunctions.changeCharacter(d, i, '0' + j);
			//	printf("%s\n",d);	
			}
		}
		if (d.charAt(0) == '0')
		{
			for (i = 0;i < al - 1;i++)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i + 1));
			}
			d = tangible.StringFunctions.changeCharacter(d, al - 2, '\0');
		}
		if (b.charAt(al - 2) == '0')
		{
			ef = tangible.StringFunctions.changeCharacter(ef, 0, b.charAt(al - 1));
			ef = tangible.StringFunctions.changeCharacter(ef, 1, '\0');
		}
		else
		{
			ef = tangible.StringFunctions.changeCharacter(ef, 0, b.charAt(al - 2));
			ef = tangible.StringFunctions.changeCharacter(ef, 1, b.charAt(al - 1));
		}
		System.out.printf("%s\n%s",d,ef);
		}
	}
}

