import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int i = 0;
		int t = 0;
		int j = 0;
		a = new Scanner(System.in).nextLine();
		while (a.charAt(t) != '\0')
		{
			t++;
		}
		for (i;i < t;i++)
		{
			if ((a.charAt(i) == ' ') && (a.charAt(i - 1) == ' '))
			{
				int u = i;
				for (u;u < t;u++)
				{
					a = tangible.StringFunctions.changeCharacter(a, u, a.charAt(u + 1));
				}
				i--;
			}
		}
			while (a.charAt(j) != '\0')
			{
				System.out.print(a.charAt(j));
				j++;
			}

		return 0;
	}
}

