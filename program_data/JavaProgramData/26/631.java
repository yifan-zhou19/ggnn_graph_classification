import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[101]);
		char i;
		char j;
		char q;
		ch = new Scanner(System.in).nextLine();
		for (i = 0; ch.charAt(i) != '\0'; i++)
		{
			if (ch.charAt(i) == ' ')
			{
				if (ch.charAt(i + 1) == ' ')
				{
					for (j = i; j < 101; j++)
					{
						ch = tangible.StringFunctions.changeCharacter(ch, j, ch.charAt(j + 1));
					}
					i--;
				}
			}
		}
		q = i;
		for (i = 0; i < q; i++)
		{
			System.out.print(ch.charAt(i));
		}
		return 0;
	}
}

