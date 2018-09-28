package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[250]);
		String d = new String(new char[250]);
		String max = new String(new char[250]);
		String x = new String(new char[250]);
		String y = new String(new char[250]);
		int i;
		int min;
		int up;
		int max1;
		for (i = 0; i <= 249; i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			d = tangible.StringFunctions.changeCharacter(d, i, '\0');
			max = tangible.StringFunctions.changeCharacter(max, i, '\0');
		}
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
		for (i = 0; i <= a.length() - 1; i++)
		{
			if (a.charAt(i) == '0')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
			}
			else
			{
				break;
			}
		}
		for (i = 0; i <= b.length() - 1; i++)
		{
			if (b.charAt(i) == '0')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			}
			else
			{
				break;
			}
		}
		min = (a.length() > b.length())?b.length():a.length();
		max1 = (a.length() > b.length())?a.length():b.length();
		if (b.length() == a.length())
		{
			c = a;
		}
		else
		{
			for (i = 0; i <= max1 - min - 1; i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, 48);
			}
			c += (a.length() > b.length())?b:a;
		}
		max = (a.length() <= b.length())?b:a;
		up = 0;
		for (i = c.length() - 1; i >= 0; i--)
		{
			if (max.charAt(i) + c.charAt(i) + up < 106)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, c.charAt(i) + max.charAt(i) - 48 + up);
				up = 0;
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, i, c.charAt(i) + max.charAt(i) - 48 - 10 + up);
				up = 0;
				up++;
			}
		}
		if (up != 0)
		{
			System.out.printf("1%s\n", d);
		}
		else
		{
			System.out.printf("%s\n", d);
		}
		return 0;
	}
}

