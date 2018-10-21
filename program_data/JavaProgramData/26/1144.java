import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		for (int i = 0;i < 105;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ' ');
		}
		a = new Scanner(System.in).nextLine();
		int len;
		len = a.length();
		a = tangible.StringFunctions.changeCharacter(a, len, ' ');
		int count = 0;
		int c = 0;
		for (int i = 0;i <= len;i++)
		{
			String b = new String(new char[105]);
			if (a.charAt(i) != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, count, a.charAt(i));
				count++;
			}
			if ((a.charAt(i) == ' ') && (a.charAt(i - 1) != ' '))
			{
				c++;
				if (c == 1)
				{
					for (int j = 0;j < count;j++)
					{
						System.out.print(b.charAt(j));
					}
				}
				else
				{
					System.out.print(" ");
					for (int j = 0;j < count;j++)
					{
						System.out.print(b.charAt(j));
					}
				}
				for (int j = 0;j < 105;j++)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '\0');
				}
				count = 0;
			}
		}
		return 0;
	}
}

