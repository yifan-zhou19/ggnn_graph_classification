package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num10 = 0; //??????10?????b?????????
		int a; //a,b??,i,j???????????
		int b;
		int i;
		int j;
		String character1 = new String(new char[100]); //???????????
		String character2 = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;;i++)
		{
			character1 = tangible.StringFunctions.changeCharacter(character1, i, System.in.read());
			if (character1.charAt(i) >= 'a' && character1.charAt(i) <= 'z')
			{
				character1 = tangible.StringFunctions.changeCharacter(character1, i, character1.charAt(i) - 87);
			}
			else if (character1.charAt(i) >= 'A' && character1.charAt(i) <= 'Z')
			{
				character1 = tangible.StringFunctions.changeCharacter(character1, i, character1.charAt(i) - 55);
			}
			else if (character1.charAt(i) >= '0' && character1.charAt(i) <= '9')
			{
				character1 = tangible.StringFunctions.changeCharacter(character1, i, character1.charAt(i) - 48);
			}
			else
			{
				break;
			}
			num10 = num10 * a + character1.charAt(i);
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;;j++)
		{
			if (num10 % b <= 9)
			{
				character2 = tangible.StringFunctions.changeCharacter(character2, j, num10 % b + 48);
			}
			if (num10 % b > 9)
			{
				character2 = tangible.StringFunctions.changeCharacter(character2, j, num10 % b + 55);
			}
			num10 = num10 / b;
			if (num10 == 0)
			{
				break;
			}
		}
		for (;j >= 0;j--)
		{
			System.out.print(character2.charAt(j));
		}
		System.out.print("\n");
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
}

