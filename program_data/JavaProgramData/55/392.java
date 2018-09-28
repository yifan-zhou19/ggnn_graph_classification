package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[101]);
		String d = new String(new char[101]);
		int a;
		int b;
		int i;
		int j;
		int p;
		int x;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		for (i = 0;i <= 100;i++)
		{
		if (c.charAt(i) == 0)
		{
			break;
		}
		else if (c.charAt(i) <= 'Z' && c.charAt(i) >= 'A')
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'A' + 10);
		}
		else if (c.charAt(i) <= 'z' && c.charAt(i) >= 'a')
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 'a' + 10);
		}
		else if (c.charAt(i) <= '9' && c.charAt(i) >= '0')
		{
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - '0');
		}
		}
		x = i;
		for (i = 0;i <= x - 1;i++)
		{
			p = 1;
			for (j = 1;j <= x - i - 1;j++)
			{
				p = p * a;
			}
			n = n + p * c.charAt(i);

		}
		i = 0;
		while ((n / b) != 0)
		{
			i++;
			d = tangible.StringFunctions.changeCharacter(d, i, n % b);
			n = n / b;
		}
		d = tangible.StringFunctions.changeCharacter(d, i + 1, n % b);
		i++;
		for (j = 1;j <= i;j++)
		{
			if (d.charAt(j) >= 10)
			{
				d = tangible.StringFunctions.changeCharacter(d, j, d.charAt(j) - 10 + 'A');
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, j, d.charAt(j) + '0');
			}
		}
		for (j = i;j >= 1;j--)
		{
			 System.out.printf("%c",d.charAt(j));
		}

	}
}

