package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String sen_1 = "\0";
		final String sen_2 = "\0";
		int i;
		int sum = 0;
		sen_1 = new Scanner(System.in).nextLine();
		sen_2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (sen_1.charAt(i) >= 'A' && sen_1.charAt(i) <= 'Z')
			{
				sen_1 = tangible.StringFunctions.changeCharacter(sen_1, i, sen_1.charAt(i) + 32);
			}
			if (sen_2.charAt(i) >= 'A' && sen_2.charAt(i) <= 'Z')
			{
				sen_2 = tangible.StringFunctions.changeCharacter(sen_2, i, sen_2.charAt(i) + 32);
			}
			if (sen_1.charAt(i) > sen_2.charAt(i))
			{
				System.out.print(">\n");
				sum = sum + 1;
				break;
			}
			else if (sen_1.charAt(i) < sen_2.charAt(i))
			{
				System.out.print("<\n");
				sum = sum + 1;
				break;
			}
			else
			{
				sum = sum;
			}
		}
		if (sum == 0)
		{
			System.out.print("=\n");
		}
		return 0;
	}
}

