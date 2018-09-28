import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		int l;
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (i = 1;i <= l - 1;i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i - 1) == ' '))
			{
				for (j = i;j <= l - 2;j++)
				{
					s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + 1));
				}
				l--;
				i--;
			}
		}
		for (i = 0;i <= l - 1; i++)
		{
			System.out.print(s.charAt(i));
		}
		return 0;
	}
}

