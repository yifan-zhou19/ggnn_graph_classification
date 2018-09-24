package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String x = new String(new char[100]);
		final String c = "";
		int i;
		int t = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) != ' ')
			{
				x = tangible.StringFunctions.changeCharacter(x, t, s.charAt(i));
				t++;
			}
			else
			{
				x = tangible.StringFunctions.changeCharacter(x, t, '\0');
				if (strcmp(x,a) == 0)
				{
					c += b;
					c += " ";
				}
				else
				{
					c += x;
					c += " ";
				}
				t = 0;
			}
		}
		x = tangible.StringFunctions.changeCharacter(x, t, '\0');
		if (strcmp(x,a) == 0)
		{
			c += b;
		}
		else
		{
			c += x;
		}
		System.out.println(c);
	}
}

