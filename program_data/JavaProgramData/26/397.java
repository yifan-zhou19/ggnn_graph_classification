package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i = 0;
		int j = 1;
		int k = 1;
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		while (a.charAt(i) != '\0')
		{
				j = 1;
				k = 1;
				if (a.charAt(i) == ' ')
				{
						   while (a.charAt(i + j) == ' ')
						   {
								   j++;
						   }
						   while (a.charAt(i + j + k - 1) != '\0')
						   {
								   a = tangible.StringFunctions.changeCharacter(a, i + k, a.charAt(i + j + k - 1));
								   k++;
						   }
						   a = tangible.StringFunctions.changeCharacter(a, i + k, '\0');
				}
				i++;
		}
		System.out.println(a);
		System.in.read();
	}

}

