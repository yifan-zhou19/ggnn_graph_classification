package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String p;
		int i;
		int j = 1;
		a = new Scanner(System.in).nextLine();
		p = a;
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		for (i = 1;i < 100;i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				if (*(p.Substring(i) - 1) != ' ')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, *(p.Substring(i)));
					j++;
				}
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, j, *(p.Substring(i)));
				j++;
			}
		}
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}

