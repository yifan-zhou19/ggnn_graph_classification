import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] count = new int[26];
		int t;
		int i;
		int j;
		final String str = "";
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < t; i++)
		{
			for (j = 0; j < 100000; j++)
			{
			   str = tangible.StringFunctions.changeCharacter(str, j, '\0');
			}
			for (j = 0; j < 26; j++)
			{
				count[j] = 0;
			}
			str = new Scanner(System.in).nextLine();
			for (j = 0; str.charAt(j) != '\0'; j++)
			{
				count[str.charAt(j) - 'a']++;
			}
			for (j = 0; j < str.length(); j++)
			{
				if (count[str.charAt(j) - 'a'] == 1)
				{
					System.out.print(str.charAt(j));
					System.out.print("\n");
					break;
				}
			}
			if (j == str.length())
			{
				System.out.print("no");
				System.out.print("\n");
			}

		}
	return 0;
	}
}

