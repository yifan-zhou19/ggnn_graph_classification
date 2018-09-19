package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		final String e = "\0";
		int i;
		int j;
		String s;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		s = a;
		a += " ";
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			j = 0;
			while (a.charAt(i) != ' ')
			{
				d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(i));
				i++;
				j++;
			}
			d = tangible.StringFunctions.changeCharacter(d, j, '\0');
			if ((!strcmp(d,b)) && (d.charAt(0) != '\0'))
			{
				e += c;
			}
			else
			{
				e += d;
			}
			if (a.charAt(i + 1) != '\0')
			{
				e += " ";
			}

		}
			System.out.println(e);
	}

}

