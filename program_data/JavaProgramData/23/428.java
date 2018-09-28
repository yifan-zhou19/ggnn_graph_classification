package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String letter = new String(new char[101]);
		int i = 0;
		while (true)
		{
			letter = tangible.StringFunctions.changeCharacter(letter, i, System.in.read());
			if (letter.charAt(i) == '\n') //??????
			{
				break;
			}
			i++;
		}
		int m;
		int n;
		int j;
		int z;
		z = i - 1; //?????
		for (j = z;j >= 0;j--)
		{
			if (letter.charAt(j) == ' ') //?????
			{
				for (m = j + 1;m <= z;m++)
				{
					System.out.print(letter.charAt(m));
				}
				System.out.print(" ");
				z = j - 1;
			}
		}
		for (n = 0;n <= z;n++) //???????
		{
			System.out.print(letter.charAt(n));
		}
			return 0;
	}

}

