import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String team = "";
		char b;
		char g;
		int i;
		int j;
		int num = 0;
		int emnum = 0;
		int n;
		team = new Scanner(System.in).nextLine();
		b = team.charAt(0);
		for (i = 0;i < 100;i++)
		{
			if (team.charAt(i) != b)
			{
				g = team.charAt(i);
				break;
			}
		}
			for (i = 0;i < 100;i++)
			{
				if (team.charAt(i) != '\0')
				{
					num++;
				}
			}
			for (n = 1;n <= num / 2;n++)
			{
				for (i = 0;i < num;i++)
				{
					if (team.charAt(i) == '\0')
					{
						continue;
					}
					else if ((team.charAt(i) != '\0') && (team.charAt(i + 1) != '\0'))
					{
						if ((team.charAt(i) == b) && (team.charAt(i + 1) == g))
						{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(i + 1);
							System.out.print("\n");
							team = tangible.StringFunctions.changeCharacter(team, i, '\0');
							team = tangible.StringFunctions.changeCharacter(team, i + 1, '\0');
							break;
						}
						else
						{
							continue;
						}
					}
					else if ((team.charAt(i) != '\0') && (team.charAt(i + 1) == '\0'))
					{
						emnum = 0;
						j = i + 1;
						while (team.charAt(j) == '\0')
						{
							emnum++;
							j++;
						}
						if ((team.charAt(i) == b) && (team.charAt(i + emnum + 1) == g))
						{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(i + emnum + 1);
							System.out.print("\n");
							team = tangible.StringFunctions.changeCharacter(team, i, '\0');
							team = tangible.StringFunctions.changeCharacter(team, i + emnum + 1, '\0');
							break;
						}
						else
						{
							continue;
						}
					}
				}
			}
			return 0;
	}

}

