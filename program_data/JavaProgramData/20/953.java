import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char temp;
		int p;
		int i;
		while (ConsoleInput.lastReadWasGood())
		{
			p = 0;
			for (i = 0;i < 11;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			}
			for (i = 0;i < 4;i++)
			{
				substr = tangible.StringFunctions.changeCharacter(substr, i, '\0');
			}
			cin.getline(str,11,' ');
			substr = new Scanner(System.in).nextLine();
			temp = str.charAt(0);
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) > temp)
				{
					temp = str.charAt(i);
					p = i;
				}
			}
			for (i = 0;i <= p;i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print(substr);
			for (i = p + 1;str.charAt(i) != '\0';i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
		}
			return 0;
	}

}

