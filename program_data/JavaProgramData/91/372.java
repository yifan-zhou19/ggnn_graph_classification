package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int e;
		int b;
		int c;
		int j;
		String a = new String(new char[1000]);
		b = 0;
		a = new Scanner(System.in).nextLine();
		e = a.length();
		b = a.charAt(0);
		for (i = 0;a.charAt(i);i++)
		{
			if (i == e-1)
			{
				c = a.charAt(i) + b - 96;
			a = tangible.StringFunctions.changeCharacter(a, i, 'a' + c - 1);
			}
			else
			{
				j = i + 1;
			c = a.charAt(i) + a.charAt(j) - 96;
			a = tangible.StringFunctions.changeCharacter(a, i, 'a' + c - 1);
			}
		}
		System.out.println(a);
		return 0;
	}
}

