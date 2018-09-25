import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] input = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String initial = new String(new char[101]);
		int found = 0; //????????
		while (input = new Scanner(System.in).nextLine())
		{
		initial = input;
		do
		{
			found = 0;
			int i = 0;
			int location = -1;
			while (input[i] != null)
			{
				if (input[i] == '(')
				{
					location = i;
					found = 1;
				}
				if (input[i] == ')')
				{
					found = 1;
					if (location == -1)
					{
						input[i] = '?';
					}
					else
					{
						input[location] = ' ';
						input[i] = ' ';
						location = -1;
						break;
					}
				}
				if (input[i] != '?' && input[i] != '$' && input[i] != '(' && input[i] != ')')
				{
					input[i] = ' ';
				}
				i++;
			}
			if (location != -1)
			{
					input[location] = '$';
					location = -1;
			}
		} while (found != 0);
		System.out.print(initial);
		System.out.print("\n");
		System.out.print(input);
		System.out.print("\n");
		}
		return 0;
	}
}
