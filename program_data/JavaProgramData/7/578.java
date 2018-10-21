package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		String d = new String(new char[300]);
		String e = new String(new char[300]);
		int i;
		int j;
		int k;
		int l;
		i = 0;
		j = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		e = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0')
		{
			c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
			if (c.charAt(j) == b.charAt(0) && (i + b.length() <= a.length()))
			{
				l = 0;
				for (k = i;k <= i + b.length() - 1;k++)
				{
					d = tangible.StringFunctions.changeCharacter(d, l, a.charAt(k));
					l++;
				}
				d = tangible.StringFunctions.changeCharacter(d, l, '\0');
				if (strcmp(d,b) == 0)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, '\0');
					System.out.printf("%s",c);
					System.out.printf("%s",e);
					j = i + b.length();
					k = 0;
					while (a.charAt(j) != '\0')
					{
						c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(j));
						j++;
						k++;
					}
					c = tangible.StringFunctions.changeCharacter(c, k, '\0');
					System.out.printf("%s",c);
					return 0;
				}
			}
			i++;
			j++;
		}
		System.out.printf("%s",a);
		return 0;
	}
}

