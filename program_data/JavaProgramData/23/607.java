import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[105]);
	public static int Main()
	{
		s = new Scanner(System.in).nextLine();
		for (int i = s.length() - 1;i >= 0;i--)
		{
			for (int j = i;j >= 0;j--)
			{
				if (s.charAt(j) == ' ')
				{
					System.out.print(s.charAt(j + 1));
					System.out.print(' ');
					s = tangible.StringFunctions.changeCharacter(s, j, '\0');
					i = j - 1;
					break;
				}
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

