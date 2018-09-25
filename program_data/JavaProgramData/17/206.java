import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word = "0";
		final String temp = "0";
		int len = 0;
		int i = 0;
		int j = 0;
		int s = 0;
		while (word = new Scanner(System.in).nextLine())
		{
			System.out.print(word);
			System.out.print("\n");
			len = word.length();
			for (i = 0;i < len;i++)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, i, ' ');
			}
			temp = tangible.StringFunctions.changeCharacter(temp, i, '\0');
			for (i = 0;i < len;i++) //???????????
			{
				if (word.charAt(i) == '(')
				{
					temp = tangible.StringFunctions.changeCharacter(temp, i, '$');
				}
				if (word.charAt(i) == ')')
				{
					temp = tangible.StringFunctions.changeCharacter(temp, i, '?');
				}
			}
			for (i = 0;i < len;i++)
			{
				s = 1;
				if (word.charAt(i) == '(') //?????????
				{

					for (j = i + 1;j < len;j++)
					{
						if (word.charAt(j) == '(')
						{
							s++;
						}
						if (word.charAt(j) == ')')
						{
							s--;
						}
						if (s == 0)
						{
							temp = tangible.StringFunctions.changeCharacter(temp, i, ' ');
							temp = tangible.StringFunctions.changeCharacter(temp, j, ' ');
							break;
						}
					}
				}
			}
			System.out.print(temp);
			System.out.print("\n");
			temp = "0";
		}
		return 0;
	}
}

