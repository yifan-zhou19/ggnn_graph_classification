package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[251]);
		int i;
		int j;
		int z;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= 250;i++)
		{
		c = tangible.StringFunctions.changeCharacter(c, i, '0');
		}
		i = a.length() - 1;
		j = b.length() - 1;
		if (i == 0 && j == 0)
		{
			System.out.printf("%d\n",0);
		}
		for (z = 250;i >= 0 && j >= 0;i--, j--, z--)
		{
			c = tangible.StringFunctions.changeCharacter(c, z, c.charAt(z) + a.charAt(i) - '0' + b.charAt(j) - '0');
			if (c.charAt(z) > '9')
			{
				c = tangible.StringFunctions.changeCharacter(c, z, c.charAt(z) - 10);
				c.charAt(z - 1)++;
			}
		}
		if (i >= 0)
		{
		for (;i >= 0;i--,z--)
		{
			c = tangible.StringFunctions.changeCharacter(c, z, c.charAt(z) + a.charAt(i) - '0');
			if (c.charAt(z) > '9')
			{
				c = tangible.StringFunctions.changeCharacter(c, z, c.charAt(z) - 10);
			c.charAt(z - 1)++;
			}
		}
		}
		if (j >= 0)
		{
		for (;j >= 0;j--,z--)
		{
			c = tangible.StringFunctions.changeCharacter(c, z, c.charAt(z) + b.charAt(j) - '0');
			if (c.charAt(z) > '9')
			{
			c = tangible.StringFunctions.changeCharacter(c, z, c.charAt(z) - 10);
			c.charAt(z - 1)++;
			}
		}
		}
		for (i = 0;i <= 250;i++)
		{
			if (c.charAt(i) != '0')
			{
			break;
			}
		}


		for (;i <= 250;i++)
		{
			System.out.print(c.charAt(i));
		}
		return 0;
	}

}

