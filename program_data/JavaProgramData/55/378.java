package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int i;
		int z;
		int x = 0;
		String n = new String(new char[65]);
		String p = new String(new char[65]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		c = n.length();
		for (i = 0;i <= (c - 1);i++)
		{
			if (n.charAt(i) <= 'Z' && n.charAt(i) >= 'A')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 32);
			}
		}
		i = 0;
		while (n.charAt(i) == '0' && i <= c - 1)
		{
			i = i + 1;
		}
		if (i == c)
		{
			System.out.print("0");
		}
		for (i = 0;i <= (c - 1);i++)
		{
			if (n.charAt(i) <= 'z' && n.charAt(i) >= 'a')
			{
				x = x * a + (n.charAt(i) - 'a' + 10);
			}
			else
			{
				x = x * a + (n.charAt(i) - '0');
			}
		}
		i = 0;
		while (x > 0)
		{
			z = x % b;
			if (z > 9)
			{
				p = tangible.StringFunctions.changeCharacter(p, i, 'A' + z - 10);
			}
			else
			{
				p = tangible.StringFunctions.changeCharacter(p, i, z + '0');
			}
			i = i + 1;
			x = x / b;
		}
		i = i - 1;
		while (i >= 0)
		{
			System.out.printf("%c",p.charAt(i));
			i = i - 1;
		}
	}

}

