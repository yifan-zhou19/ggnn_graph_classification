import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		a = new Scanner(System.in).nextLine();
		int len = a.length();
		char boy = a.charAt(0);
		char girl = a.charAt(len - 1);
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 1; i < len; i++)
		{
			if (a.charAt(i) == girl)
			{
				for (j = i - 1; j >= 0; j--)
				{
					if (a.charAt(j) == boy)
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a = tangible.StringFunctions.changeCharacter(a, j, '1');
						break;
					}
				}
			}
		}
		return 0;
	}
}

