import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		final String word1 = "";
		final String word2 = "";
		word1 = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (word1.charAt(i) == '\0')
			{
				break;
			}
			if (word1.charAt(i) != ' ')
			{
				word2 = tangible.StringFunctions.changeCharacter(word2, j, word1.charAt(i));
				j++;
			}

			if (word1.charAt(i) == ' ' && word1.charAt(i + 1) != ' ')
			{
				word2 = tangible.StringFunctions.changeCharacter(word2, j, word1.charAt(i));
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.print(word2.charAt(i));
		}
		return 0;
	}
}

