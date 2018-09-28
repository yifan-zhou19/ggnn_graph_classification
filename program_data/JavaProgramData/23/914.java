package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String ch1 = new String(new char[1000]);
		String ch2 = new String(new char[1000]);
		int i;
		int s;
		int j = 0;
		int k;
		ch1 = new Scanner(System.in).nextLine();
		s = ch1.length() - 1;
		ch1 = tangible.StringFunctions.changeCharacter(ch1, -1, ' ');
		for (i = 0;i <= s;i++)
		{
			if (ch1.charAt(i) == ' ')
			{
				ch2 = tangible.StringFunctions.changeCharacter(ch2, j, i);
				j = j + 1;
			}
		}
		if (j - 1 >= 0)
		{
				for (i = ch2.charAt(j - 1) + 1;i <= s;i++)
				{
					System.out.printf("%c",ch1.charAt(i));
				}
				for (k = j - 1;k >= 1;k--)
				{
					for (i = ch2.charAt(k - 1);i < ch2.charAt(k);i++)
					{
						System.out.printf("%c",ch1.charAt(i));
					}
				}
				for (i = -1;i < ch2.charAt(0);i++)
				{
					  System.out.printf("%c",ch1.charAt(i));
				}
		}
		else
		{
			System.out.println(ch1);
		}
	}
}

