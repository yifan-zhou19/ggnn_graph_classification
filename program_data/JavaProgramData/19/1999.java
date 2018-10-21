package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		String aim = new String(new char[101]);
		String change = new String(new char[101]);

		str = new Scanner(System.in).nextLine();
		aim = new Scanner(System.in).nextLine();
		change = new Scanner(System.in).nextLine();

		int i;
		int count;
		String tword = new String(new char[101]);
		count = 0;
		tword = tangible.StringFunctions.changeCharacter(tword, count, '\0');
		for (i = 0;i < str.length();i++)
		{
								  if (str.charAt(i) != ' ' && str.charAt(i) != ',') //????????????????????????
								  {
													tword = tangible.StringFunctions.changeCharacter(tword, count, str.charAt(i));
													count++;
								  }
								  else
								  {
									  tword = tangible.StringFunctions.changeCharacter(tword, count, '\0');
									  if (strcmp(tword, aim) == 0)
									  {
													   System.out.printf("%s ", change);
									  }
									  else
									  {
										  System.out.printf("%s ", tword);
									  }
									  count = 0;
									  tword = tangible.StringFunctions.changeCharacter(tword, count, '\0');
								  }
		}
		tword = tangible.StringFunctions.changeCharacter(tword, count, '\0');
		if (strcmp(tword, aim) == 0)
		{
						 System.out.printf("%s", change);
		}
		else
		{
			System.out.printf("%s", tword);
		}
		return 0;
	}
}

