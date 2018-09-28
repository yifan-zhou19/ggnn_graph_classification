package <missing>;

public class GlobalMembers
{
	public static void hand()
	{
		int i;
		int j;
		int judge;
		if (team.charAt(0) == sex.charAt(0)) //?????????????????
		{
			judge = 0;
			for (i = 0;i < 100;i++)
			{
				if (team.charAt(i) == sex.charAt(1)) //???????
				{
					for (j = 1;j < 100;j++)
					{
						if (team.charAt(i - j) == sex.charAt(0)) //????????
						{
							judge = 1;
							break;
						}
					}
					if (judge == 1)
					{
						break;
					}
				}
			}
			System.out.print(i - j);
			System.out.print(" ");
			System.out.print(i);
			System.out.print("\n");
			team = tangible.StringFunctions.changeCharacter(team, i, '\0'); //?????????
			team = tangible.StringFunctions.changeCharacter(team, i - j, '\0');
			hand();
		}
	}
	public static String sex = new String(new char[2]);
	public static String team = new String(new char[100]);
	public static int Main()
	{
		int i;
		team = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sex = tangible.StringFunctions.changeCharacter(sex, 0, team.charAt(0)); //???????????
		for (i = 0;i < 100;i++)
		{
			if (team.charAt(i) != team.charAt(0) && team.charAt(i) != '\0') //?????????
			{
				sex = tangible.StringFunctions.changeCharacter(sex, 1, team.charAt(i));
			}
			else if (team.charAt(i) == '\0')
			{
				break;
			}
		}
		hand(); //????
		return 0;
	}



}

