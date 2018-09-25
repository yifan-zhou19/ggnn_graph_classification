import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String a = new String(new char[90000]);
		a = new Scanner(System.in).nextLine();
		int la = a.length();
		int i;
		int j = 80;
		while (j < la)
		{
			for (i = j; i > j - 30; i--)
			{
				if (a.charAt(i) == ' ')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '~');
					break;
				}
			}
			j = i + 81;
		}
		for (i = 0; i < la; i++)
		{
			if (a.charAt(i) != '~')
			{
				System.out.print(a.charAt(i));
			}
			else
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

