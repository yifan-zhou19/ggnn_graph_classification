import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int m;
		a = new Scanner(System.in).nextLine();
		m = a.length();
		for (i = 1; i < m; i++)
		{
			if (a.charAt(i) == a.charAt(m - 1))
			{
				for (j = i - 1; ; j--)
				{
					if (a.charAt(j) == a.charAt(0))
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a = tangible.StringFunctions.changeCharacter(a, i, 's');
						a = tangible.StringFunctions.changeCharacter(a, j, 's');
						break;
					}
				}
			}
		}
		return 0;
	}
}

