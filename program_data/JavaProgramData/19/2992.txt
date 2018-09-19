import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		final String c = "";
		c = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int k = 0;
		while (c.charAt(i) != '\0')
		{
			if (c.charAt(i) != ' ')
			{
				str.charAt(j)[k] = c.charAt(i);
				k++;
			}
			if (c.charAt(i) == ' ')
			{
				j++;
				k = 0;
			}
			i++;
		}
		String st1 = new String(new char[100]);
		String st2 = new String(new char[100]);
		st1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		st2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < j + 1;i++)
		{
			if (strcmp(str.charAt(i),st1) == 0)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, st2);
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.print(str.charAt(i));
			System.out.print(" ");
		}
		System.out.print(str.charAt(j));
		return 0;
	}
}

