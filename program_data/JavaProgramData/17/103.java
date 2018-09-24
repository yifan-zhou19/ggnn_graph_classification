import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word = ""; //??????
		int[] left = new int[200]; //??????????
		int i = 0;
		int k = 0;
		while (word = new Scanner(System.in).nextLine())
		{
			for (i = 0; word.charAt(i); i++) //???
			{
				System.out.print(word.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; word.charAt(i); i++) //????
			{
				if (word.charAt(i) == '(') //??????????left?
				{
					left[k] = i;
					k++;
					word = tangible.StringFunctions.changeCharacter(word, i, '$');
				}
				else if (word.charAt(i) == ')') //?????left????????
				{
					if (k != 0)
					{
						k--;
						word = tangible.StringFunctions.changeCharacter(word, left[k], ' ');
						word = tangible.StringFunctions.changeCharacter(word, i, ' ');
					}
					else
					{
						word = tangible.StringFunctions.changeCharacter(word, i, '?');
					}
				}
				else //???????
				{
					word = tangible.StringFunctions.changeCharacter(word, i, ' ');
				}
			}
			for (i = 0; word.charAt(i); i++) //???
			{
				System.out.print(word.charAt(i));
			}
			System.out.print("\n");
			k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(word, '\0', (Character.SIZE / Byte.SIZE));
		}
		return 0;
	}
}

