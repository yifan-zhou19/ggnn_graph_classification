package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[257]);
		String b = new String(new char[257]);
		String c = new String(new char[257]);
		String d = new String(new char[257]);
		String e = new String(new char[257]);
		String f = new String(new char[257]);
		int i;
		int n1;
		int n2;
		int k;
		int j;
		int m = 1;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		e = new Scanner(System.in).nextLine();
		n1 = a.length();
		n2 = b.length();
		for (i = 0;i < n1;i++)
		{
			d = tangible.StringFunctions.changeCharacter(d, i, a.charAt(i));
			for (k = 0;k < n2;k++)
			{
				c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(i + k));
			}
			c = c.substring(0, n2);
			if (strcmp(b,c) == 0)
			{
				d = d.substring(0, i);
				for (j = 0;j < (n1 - n2 - i);j++)
				{
					f = tangible.StringFunctions.changeCharacter(f, j, a.charAt(i + n2 + j));
				}
				f = f.substring(0, j);
				System.out.printf("%s%s%s",d,e,f);
				m = 0;
							   break;
			}
		}
		if (m != 0)
		{
			System.out.println(a);
		}
		return 0;
	}
}

