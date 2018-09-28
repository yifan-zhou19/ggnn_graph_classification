import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String sex = new String(new char[2]);

	public static void check(String line, int n)
	{
		int i;
		if (n == line.length() - 1)
		{
			System.out.print(0);
			System.out.print(' ');
			System.out.print(n);
			System.out.print("\n");
			System.exit(0);
		}
		else
		{
			if (!line[n].equals(sex.charAt(1)))
			{
				check(line, n + 1);
			}
			else
			{
				for (i = n - 1; i >= 0; i--)
				{
					if (line[i].equals(sex.charAt(0)))
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(n);
						System.out.print("\n");
						line[i] = ' ';
						line[n] = ' ';
						break;
					}
				}
			}
			check(line, n + 1);
		}
	}

	public static int Main()
	{
		String line = new String(new char[501]);
		line = new Scanner(System.in).nextLine();
		sex = tangible.StringFunctions.changeCharacter(sex, 0, line.charAt(0));
		sex = tangible.StringFunctions.changeCharacter(sex, 1, line.charAt(line.length() - 1));

		check(line, 1);

		return 0;
	}
}

