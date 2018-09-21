package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		String ch1 = new String(new char[100]);
		char[][] ch2 = new char[100][100];
		String ch3 = new String(new char[100]);
		ch1 = new Scanner(System.in).nextLine();
		while (ch1.charAt(i) != '\0')
		{
			if (ch1.charAt(i) != ' ')
			{
				ch3 = tangible.StringFunctions.changeCharacter(ch3, j, ch1.charAt(i));
				j++;
			}
			else
			{
				ch3 = tangible.StringFunctions.changeCharacter(ch3, j, '\0');
				ch2[k] = ch3;
				k++;
				j = 0;
			}
			i++;
		}
		ch3 = tangible.StringFunctions.changeCharacter(ch3, j, '\0');
		ch2[k] = ch3;
		for (;k > 0;k--)
		{
		System.out.printf("%s ",ch2[k]);
		}
		System.out.printf("%s",ch2[0]);
	}
}

