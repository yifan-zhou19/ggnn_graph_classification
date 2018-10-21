package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[300]);
		String c = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
		int n = Integer.parseInt(a);
		int i;
		int k;
		int s;
		for (i = 0;i < n;i++)
		{
			b = new Scanner(System.in).nextLine();
			s = b.length();
			for (k = 0;b.charAt(k) != '\0';k++)
			{
				switch (b.charAt(k))
				{
				case 'A':
					c = tangible.StringFunctions.changeCharacter(c, k, 'T');
					break;
				case 'T':
					c = tangible.StringFunctions.changeCharacter(c, k, 'A');
					break;
				case 'C':
					c = tangible.StringFunctions.changeCharacter(c, k, 'G');
					break;
				case 'G':
					c = tangible.StringFunctions.changeCharacter(c, k, 'C');
					break;
				}
			}
			c = tangible.StringFunctions.changeCharacter(c, s, '\0');
			System.out.println(c);
		}



		return 0;
	}


}

