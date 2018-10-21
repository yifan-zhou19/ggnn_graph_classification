import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int l;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) == ' ')
				{
					for (j = i;j < l;j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					}
					l--;
					i--;
				}
			}
		}
		for (j = 0;j < l - 1;j++)
		{
			System.out.print(a.charAt(j));
		}
		System.out.print(a.charAt(l - 1));
		System.out.print("\n");
		return 0;
	}
}

