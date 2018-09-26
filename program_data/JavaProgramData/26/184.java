import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int i;
		int j;
		int count = 0;
		for (i = 0; str.charAt(i) != '\0'; i++)
		{

			if (str.charAt(i) == ' ')
			{
				count++;
			}
			if (count == 1 && str.charAt(i) != ' ')
			{
			 count = 0;
			}
			if (count >= 2 && str.charAt(i) != ' ')
			{
				for (j = i - count + 1; str.charAt(j) != '\0'; j++)
				{
				 str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + count - 1));
				}
				i -= count;
				count = 0;
			}

		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}

