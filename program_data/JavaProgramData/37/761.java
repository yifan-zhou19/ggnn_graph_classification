import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		String only = new String(new char[1000]);
		int i;
		int j;
		int[] count = new int[26];
		int t;
		int len;
		int temp;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= t; i++)
		{
			for (j = 0; j < 26; j++)
			{
				count[j] = 0;
			}
			a = new Scanner(System.in).nextLine();
			len = a.length();
			for (j = 0; j < len; j++)
			{
				temp = a.charAt(j) - 'a';
				count[temp]++;
			}
			for (j = 0; j < len; j++)
			{
				temp = a.charAt(j) - 'a';
				if (count[temp] == 1)
				{
					only = tangible.StringFunctions.changeCharacter(only, i, a.charAt(j));
					break;
				}
			}
			if (j == len)
			{
				only = tangible.StringFunctions.changeCharacter(only, i, 'A');
			}
		}
		for (i = 1; i <= t; i++)
		{
			if (only.charAt(i) == 'A')
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print(only.charAt(i));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

