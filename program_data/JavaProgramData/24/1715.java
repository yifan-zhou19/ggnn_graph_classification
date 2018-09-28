package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m = 0;
		int n = 1000;
		int o;
		int p;
		int q;
		String jz = new String(new char[500]);
		jz = new Scanner(System.in).nextLine();
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		o = jz.length();
		for (i = 0;i < o;i++)
		{
			j = 0;
			while (jz.charAt(i) != ' ')
			{
				a = tangible.StringFunctions.changeCharacter(a, j, jz.charAt(i));
				j++;
				i++;
			}
			a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			p = a.length();

			if (m < p)
			{
				m = p;
				b = a;
			}
			q = a.length();
			if (n > q)
			{
				n = q;
				c = a;
			}
		}
		System.out.printf("%s\n",b);
		System.out.printf("%s\n",c);
		return 0;
	}
}

