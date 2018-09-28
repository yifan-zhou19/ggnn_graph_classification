import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char girl;
		char boy;
		a = new Scanner(System.in).nextLine();
		boy = a.charAt(0);
		int i;
		int j;
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) != boy)
			{
				girl = a.charAt(i);
				break;
			}
		}
		for (i = 0; a.charAt(i) != '\0'; i++)
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
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						break;
					}

				}
			}
		}
		return 0;
	}
}

