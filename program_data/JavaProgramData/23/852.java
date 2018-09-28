package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch1 = new String(new char[100]);
		String ch2 = new String(new char[100]);

	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j,s,k=0,chang;
		int i;
		int j;
		int s;
		int k = 0;
		int chang;
		ch1 = new Scanner(System.in).nextLine();
		s = ch1.length();
		for (i = 0;i < 100;i++)
		{
		ch2 = tangible.StringFunctions.changeCharacter(ch2, i, '\0');
		}

	for (i = 0;i < s;i++)
	{
			if (ch1.charAt(i) == ' ')
			{
			chang = i - k;
			 for (j = 0;j < chang;j++)
			 {
				 ch2 = tangible.StringFunctions.changeCharacter(ch2, s - chang - k + j, ch1.charAt(k + j));
			 if (j == chang - 1)
			 {
				 ch2 = tangible.StringFunctions.changeCharacter(ch2, s - chang - k - 1, ' ');
			 }
			 }
			k = i + 1;
			}

	}
			 chang = i - k;
			 for (j = 0;j < chang;j++)
			 {
			   ch2 = tangible.StringFunctions.changeCharacter(ch2, s - chang - k + j, ch1.charAt(k + j));
			 }

		System.out.printf("%s",ch2);
	}
}

