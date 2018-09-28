package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i = 0;
		int x = 0;
		int k;
		String c = new String(new char[20]);
		String n = new String(new char[20]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		while (c.charAt(i) != '\0')
		{
			if (c.charAt(i) >= 65 && c.charAt(i) <= 90)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 55);
			}
			else if (c.charAt(i) >= 97 && c.charAt(i) <= 122)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 87);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 48);
			}
			i++;
		}
		for (k = 0;k <= i - 1;k++)
		{
			x = a * x + c.charAt(k);
		}
		i = 0;
		if (x == 0)
		{
			System.out.print("0");
		}
		while (x != 0)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, x % b);
			x = x / b;
			if (n.charAt(i) >= 10)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 55);
			}
			else
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 48);
			}
			i++;
		}
		n = tangible.StringFunctions.changeCharacter(n, i, '\0');
		for (i = 0;;i++)
		{
			if (n.charAt(i) == '\0')
			{
				break;
			}
		}
		for (k = i - 1;k >= 0;k--)
		{
			System.out.printf("%c",n.charAt(k));
		}
		System.out.print("\n");
	}

}

