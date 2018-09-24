package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int p;
		int a;
		String c1 = new String(new char[100]);
		String c2 = new String(new char[100]);
		for (i = 1;i < 100;i++)
		{
			c1 = tangible.StringFunctions.changeCharacter(c1, i, c2[i] = 0);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		i = 0;
		p = 0;
		while (c1.charAt(i) != 0)
		{
			i++;
		}
		a = i;
		i = 0;
		while (c2.charAt(i) != 0)
		{
			i++;
		}
		if (a == i)
		{
			i = 0;
		while (c1.charAt(i) != 0)
		{
			for (p = 0;p < 100;p++)
			{
				if (c2.charAt(p) == c1.charAt(i))
				{
					c2 = tangible.StringFunctions.changeCharacter(c2, p, c1[i] = 0);
				}
			}
			i++;
		}
		p = 0;
		for (i = 0;i < 100;i++)
		{
			if (c1.charAt(i) != 0)
			{
				p++;
			}
		}
		if (p == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

