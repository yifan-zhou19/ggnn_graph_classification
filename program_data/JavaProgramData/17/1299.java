package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_c = new String(new char[102]);
String d = new String(new char[102]);
	public static int Main()
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static char c[102],d[102];
		int i;
		int j;
		int k;
		int s;
		while (gets(Main_c))
		{
			System.out.println(Main_c);
		for (i = 0;Main_c.charAt(i) != '\0';i++)
		{

			if (Main_c.charAt(i) == '(')
			{
			d = tangible.StringFunctions.changeCharacter(d, i, 1);
			}
			else if (Main_c.charAt(i) == ')')
			{
			d = tangible.StringFunctions.changeCharacter(d, i, 2);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, i, 3);
			}
		}
		while (true)
		{
			s = 0;
			for (j = 0;j <= i - 2;j++)
			{
				if (d.charAt(j) == 1)
				{
				break;
				}
			}
			for (k = j + 1;k <= i - 1;k++)
			{
				if (d.charAt(k) == 2)
				{
				s = 1;
				break;
				}
			}
		if (s == 0)
		{
		break;
		}
		for (j = 0;j <= i - 2;j++)
		{
			if (d.charAt(j) == 1)
			{
			for (k = j + 1;k <= i - 1;k++)
			{
				if (d.charAt(k) == 1)
				{
					j = k;
				}
				if (d.charAt(k) == 2)
				{
					d = tangible.StringFunctions.changeCharacter(d, j, 3);
					d = tangible.StringFunctions.changeCharacter(d, k, 3);
					break;
				}
			}
			}
		}

		}
		for (k = 0;k <= i - 1;k++)
		{
			switch (d.charAt(k))
			{
				case 1:
					System.out.print("$");
					break;
				case 2:
					System.out.print("?");
					break;
				case 3:
					System.out.print(" ");
					break;
			}
		}
		System.out.print("\n");
		}

	}
}

