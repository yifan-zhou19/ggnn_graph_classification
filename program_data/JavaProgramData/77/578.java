import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String row = new String(new char[100]);
	public static void pipei(int i, char boy, char girl)
	{
		int j;
		if (row.charAt(i) == girl)
		{
			for (j = i - 1; j >= 0; j--)
			{
				if (row.charAt(j) == boy)
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					row = tangible.StringFunctions.changeCharacter(row, j, ' ');
					row = tangible.StringFunctions.changeCharacter(row, i, ' ');
					break;

				}
			}
		}
		if (row.charAt(i + 1) != '\0')
		{
			pipei(i + 1, boy, girl);
		}

	}

	public static int Main()
	{
		char girl;
		char boy;
		row = new Scanner(System.in).nextLine();
		boy = row.charAt(0);
		int i;
		for (i = 0; row.charAt(i) != '\0'; i++)
		{
			if (row.charAt(i) != boy)
			{
				girl = row.charAt(i);
				break;
			}
		}
		pipei(1, boy, girl);
		return 0;
	}

}

