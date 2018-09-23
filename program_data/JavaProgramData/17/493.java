import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[101]);
		String label = new String(new char[101]);
		int[] pos = new int[100];
		int left = 0;
		int right = 0;
		int pos_i;
		int length;
		int i;
		while (line = new Scanner(System.in).nextLine())
		{
			for (i = 0; i < 101; i++)
			{
				label = tangible.StringFunctions.changeCharacter(label, i, ' ');
			}
			pos_i = -1, left = 0, right = 0;
			length = line.length();
			for (i = 0; line.charAt(i) != '\0'; i++)
			{
				if (line.charAt(i) == '(')
				{
					pos_i++;
					pos[pos_i] = i;
					left++;
				}
				if (line.charAt(i) == ')')
				{
					if (right >= left)
					{
						label = tangible.StringFunctions.changeCharacter(label, i, '?');
					}
					else
					{
						right++;
						pos_i--;
					}
				}
			}
			if (pos_i >= 0)
			{
				for (i = 0; i <= pos_i; i++)
				{
					label = tangible.StringFunctions.changeCharacter(label, pos[i], '$');
				}
			}
			label = tangible.StringFunctions.changeCharacter(label, length, '\0');
			System.out.print(line);
			System.out.print("\n");
			System.out.print(label);
			System.out.print("\n");
		}
		return 0;
	}

}

