package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String str2 = new String(new char[100]);
		int i;
		int j;
		int l;
		int sum;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		j = 0;
		sum = 0;
		for (i = 0;i < l;i++)
		{
				if (i == 0 && str.charAt(i) == ' ')
				{
				continue;
				}
				if (str.charAt(i) == ' ')
				{
							 if (str.charAt(i + 1) == ' ' || str.charAt(i + 1) == '\0')
							 {
							 continue;
							 }
							 else
							 {
								 str2 = tangible.StringFunctions.changeCharacter(str2, j, str.charAt(i));
								 j++;
							 }
				}
				else
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j, str.charAt(i));
					j++;
				}

		}
		 str2 = tangible.StringFunctions.changeCharacter(str2, j, '\0');
		 System.out.println(str2);
		 System.in.read();
		 System.in.read();
	}

}

