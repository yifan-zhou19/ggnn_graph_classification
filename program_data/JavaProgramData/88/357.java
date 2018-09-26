package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		char i;
		for (i = 0;i < 30;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ' '); //?????????????
		}

		a = new Scanner(System.in).nextLine(); //????????

		for (i = 0;i < 30;i++)
		{
			if (a.charAt(i) == 48 || a.charAt(i) == 49 || a.charAt(i) == 50 || a.charAt(i) == 51 || a.charAt(i) == 52 || a.charAt(i) == 53 || a.charAt(i) == 54 || a.charAt(i) == 55 || a.charAt(i) == 56 || a.charAt(i) == 57)
			{ //ASCII???
				System.out.printf("%c",a.charAt(i)); //????????????
				if (i + 1 < 30 && (a.charAt(i + 1) < 48 || a.charAt(i + 1)>57))
				{
					System.out.print("\n"); //??????????????????
				}
			}
		}

		return 0;
	}
}

