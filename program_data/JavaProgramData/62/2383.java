import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word_in = new String(new char[1000]);
		String word_out = new String(new char[1000]);
		int sum;
		int k = 0;
		for (int i = 0;i < 1000;i++)
		{
			word_in = word_in.substring(0, i);
			word_out = word_out.substring(0, i);
		}
		word_in = new Scanner(System.in).nextLine();
		sum = word_in.length();
		for (int i = 0;i < sum;i++)
		{
			if (word_in.charAt(i) != 32)
			{
				word_out = tangible.StringFunctions.changeCharacter(word_out, k, word_in.charAt(i));
				k++;
			}
			if (word_in.charAt(i) == 32)
			{
				if (word_in.charAt(i + 1) != 32)
				{
					word_out = tangible.StringFunctions.changeCharacter(word_out, k, word_in.charAt(i));
					k++;
				}
			}
		}
		sum = word_out.length();
		for (int i = 0;i < sum;i++)
		{
			System.out.print(word_out.charAt(i));
		}
		return 0;
	}

}

