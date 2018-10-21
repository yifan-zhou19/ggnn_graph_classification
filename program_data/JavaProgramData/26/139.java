import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		for (i = 2;a.charAt(i) != 0;i++)
		{
			if (a.charAt(i - 1) == ' ' && a.charAt(i - 2) == ' ')
			{
				for (j = i - 2;a.charAt(j + 1) != 0;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				a = a.substring(0, j);
				i--;
			}
		}
		for (i = 0;a.charAt(i) != 0;i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}
}

