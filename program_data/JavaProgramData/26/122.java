import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100]);
		String output = new String(new char[100]);
		int i = 0;
		int flag = 0;
		int p = 0;
		word = new Scanner(System.in).nextLine();
		for (; word.charAt(i) != '\0'; i++)
		{
			if (flag == 1 && word.charAt(i) == ' ')
			{
				continue;
			}
			if (word.charAt(i) != ' ')
			{
				flag = 0;
			}
			else
			{
				flag = 1;
			}
			output = tangible.StringFunctions.changeCharacter(output, p++, word.charAt(i));
			output = tangible.StringFunctions.changeCharacter(output, p, '\0');
		}
		System.out.print(output);
		System.out.print("\n");
		return 0;
	}


}

