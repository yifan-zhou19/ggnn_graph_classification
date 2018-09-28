package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
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
		int i = 0;
		int j = 0;
		while (a.charAt(i) != '\0')
		{
			i++;
		}
		while (b.charAt(j) != '\0')
		{
			j++;
		}
		int d;
		int k;
		if (i - j > 0)
		{
			d = i - j;
			for (k = i ; k >= i - j ; k--)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, b.charAt(k - d));
			}
			for (k = 0 ; k < i - j ; k++)
			{
				b = tangible.StringFunctions.changeCharacter(b, k, '0');
			}
		}
		else
		{
			d = j - i;
			for (k = j ; k >= j - i ; k--)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k - d));
			}
			for (k = 0 ; k < j - i ; k++)
			{
				a = tangible.StringFunctions.changeCharacter(a, k, '0');
			}
		}
		int max;
		if (i > j)
		{
			max = i;
		}
		else
		{
			max = j;
		}
		String c = new String(new char[251]);
		c = tangible.StringFunctions.changeCharacter(c, max + 1, '\0');
		c = tangible.StringFunctions.changeCharacter(c, 0, '0');
		for (k = max - 1 ; k >= 0 ; k--)
		{
			c = tangible.StringFunctions.changeCharacter(c, k + 1, a.charAt(k) + b.charAt(k) - 48);
			if (c.charAt(k + 1) > '9')
			{
				c.charAt(k + 1) -= 10;
				if (k != 0)
				{
					a.charAt(k - 1) += 1;
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, 0, '1');
				}
			}
		}
		//printf("%s\n",c);
		int count = 0;
		for (k = 0 ; k <= max ; k++)
		{
			if (c.charAt(k) != '0' && count == 0)
			{
				System.out.printf("%c",c.charAt(k));
				count++;
				continue;
			}
			if (count != 0)
			{
				System.out.printf("%c",c.charAt(k));
			}
			//printf("%d\n",k);
		}
		System.out.print("\n");
		return 0;
	}
}

