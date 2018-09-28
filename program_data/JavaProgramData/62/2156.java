import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100000]);
		str = new Scanner(System.in).nextLine();

		int i; //flag?????????

		for (i = 1; str.charAt(i) != '\0';)
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				for (int j = i + 1; str.charAt(j) != '\0';j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
				}
			}
			else
			{
				i++;
			}
		}

		System.out.print(str);

		return 0;
	}
}

