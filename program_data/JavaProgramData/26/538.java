import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		int i;
		int j;
		int k;
		int g;
		int m;
		int n;
		while (a = new Scanner(System.in).nextLine())
		{
			g = a.length();
			for (k = 1;k < g - 1;k++)
			{
			for (i = 1;i < g - 1;i++)
			{
				if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
				{
					for (j = i;j < g - 1;j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					}
					a = tangible.StringFunctions.changeCharacter(a, g - 1, '\0');
					g--;
				}
			}
			}
			System.out.print(a);
			System.out.print("\n");
		}

		return 0;
	}

}

