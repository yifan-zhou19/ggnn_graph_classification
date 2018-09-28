package <missing>;

public class GlobalMembers
{
	//******************************************
	//???????????????           *
	//???? ?                              *
	//???2013/11/10                         *
	//????????????????         *
	//******************************************
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		String c = new String(new char[80]);
		a = new Scanner(System.in).nextLine();

		b = new Scanner(System.in).nextLine();
		for (int i = 0;i < 80;i++)
		{
			if (a.charAt(i) > ('a' - 1))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + ('A'-'a'));
			}
			if (b.charAt(i) > ('a' - 1))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + ('A'-'a'));
			}
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		return 0;
	}


}

