import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String from = new String(new char[100]);
		String to = new String(new char[100]);
		while (true)
		{
			int max = 0;
			String str = new String(new char[1000]);
			str = new Scanner(System.in).nextLine();
			if (str.charAt(0) == '\0')
			{
				return 0;
			}
			int lenstr = str.length();
			if (lenstr == 0)
			{
				return 0;
			};
			int i;
			for (i = 0;i < lenstr;i++)
			{
				if (str.charAt(i) == ' ')
				{
					break;
				}
				from = tangible.StringFunctions.changeCharacter(from, i, str.charAt(i));
			}
			from = tangible.StringFunctions.changeCharacter(from, i, '\0');
			int k;
			k = 0;
			for (++i;i < lenstr;i++)
			{
				to = tangible.StringFunctions.changeCharacter(to, k, str.charAt(i));
				k++;
			}
			to = tangible.StringFunctions.changeCharacter(to, k, '\0');
			int len;
			len = from.length();
			int maxpos = 0;
			for (i = 0;i < len;i++)
			{
				if (from.charAt(i) > max)
				{
					max = from.charAt(i);
					maxpos = i;
				}
			}
			int j;
			for (j = 0;j <= maxpos;j++)
			{
				System.out.printf("%c",from.charAt(j));
			}
			for (i = 0;to.charAt(i) != '\0';i++)
			{
				System.out.printf("%c",to.charAt(i));
			}

			for (;from.charAt(j) != '\0';j++)
			{
				System.out.printf("%c",from.charAt(j));
			}
			System.out.print("\n");

		}
		return 0;
	}

}

