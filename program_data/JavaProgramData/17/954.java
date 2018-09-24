import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String line = new String(new char[1000]);
		String label = new String(new char[1000]);
		int[] pos = new int[1000];
		int len;
		int i;
		while (line = new Scanner(System.in).nextLine())
		{
			int left = 0;
			int right = 0;
			int s = -1;
			len = line.length();
			for (i = 0;i < 1000;i++)
			{
				label = tangible.StringFunctions.changeCharacter(label, i, ' ');
			}
			for (i = 0;line.charAt(i) != '\0';i++)
			{
				if (line.charAt(i) == '(')
				{
					pos[++s] = i;
					left++;
				}
				if (line.charAt(i) == ')')
				{
					if (left <= right)
					{
						label = tangible.StringFunctions.changeCharacter(label, i, '?');
					}
					else
					{
						right++;
						s--;
					}
				}
			}
			if (s >= 0)
			{
				for (i = 0;i <= s;i++)
				{
					label = tangible.StringFunctions.changeCharacter(label, pos[i], '$');
				}
			}
			label = tangible.StringFunctions.changeCharacter(label, len, '\0');
			System.out.print(line);
			System.out.print("\n");
			System.out.print(label);
			System.out.print("\n");
		}
		return 0;
	}

}

