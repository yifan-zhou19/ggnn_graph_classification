package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String c = "";
		final String c1 = "";
		final String c2 = "";
		int a;
		int b;
		int d;
		int e = 0;
		int f = 0;
		int g;
		int j;
		c = new Scanner(System.in).nextLine();
		for (a = 0;a < 100;a++)
		{
			if (c.charAt(a) == ' ')
			{
				break;
			}
			else
			{
				c1 = tangible.StringFunctions.changeCharacter(c1, a, c.charAt(a));
			}
		}
		for (b = 0;b < 100;b++)
		{
			c2 = tangible.StringFunctions.changeCharacter(c2, b, c.charAt(a + 1 + b));
		}
		g = c1.length();
		j = c2.length();
		if (g != j)
		{
			System.out.print("NO\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto end;
		}
		for (a = 0;a < g;a++)
		{
			e = 0;
			for (b = 0;b < j;b++)
			{
				if (c1.charAt(a) == c2.charAt(b))
				{
					e++;
					c2 = tangible.StringFunctions.changeCharacter(c2, b, ' ');
					break;
				}
			}
			if (e == 0)
			{
				System.out.print("NO\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		}
		if (a == g)
		{
			System.out.print("YES\n");
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	;
	}



}

