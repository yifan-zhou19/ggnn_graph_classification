package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String c = new String(new char[200]);
		String d = new String(new char[200]);
		int ai = 0;
		int lb;
		int la;
		int lc;
		int bi = 0;
		int ci = 0;
		int di = 0;
		int k;
		a = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		lb = b.length();
		la = a.length();
		lc = c.length();
		while (ai != la)
		{
			bi = 0;
			ci = 0;
			if (ai != 0)
			{
			if ((a.charAt(ai) == b.charAt(bi)) && (a.charAt(ai - 1) == ' '))
			{

				k = ai;
				while ((a.charAt(ai) == b.charAt(bi)) && (a.charAt(ai) != ' ') && (a.charAt(ai) != '\0'))
				{
					bi++;
					ai++;
				}
				if (bi == lb)
				{
					while (ci != lc)
					{
					  d = tangible.StringFunctions.changeCharacter(d, di, c.charAt(ci));
					  di++;
					  ci++;
					}
				}
				else
				{
				   ai = k;
				   d = tangible.StringFunctions.changeCharacter(d, di, a.charAt(ai));
				   di++;
				   ai++;
				}
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, di, a.charAt(ai));
				ai++;
				di++;
			}
			}
			else
			{
			if (a.charAt(ai) == b.charAt(bi))
			{

				k = ai;
				while (a.charAt(ai) == b.charAt(bi))
				{
					bi++;
					ai++;
				}
				if (bi == lb)
				{
					while (ci != lc)
					{
					  d = tangible.StringFunctions.changeCharacter(d, di, c.charAt(ci));
					  di++;
					  ci++;
					}
				}
				else
				{
				   ai = k;
				   d = tangible.StringFunctions.changeCharacter(d, di, a.charAt(ai));
				   di++;
				   ai++;
				}
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, di, a.charAt(ai));
				ai++;
				di++;
			}
			}


		}
	//	puts(a);puts(b);puts(c);
		d = tangible.StringFunctions.changeCharacter(d, di, '\0');
	//	printf("%d",la);
		System.out.println(d);
		return 0;
	}

}

