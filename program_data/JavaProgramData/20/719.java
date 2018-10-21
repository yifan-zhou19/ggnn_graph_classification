import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int fmax(String str)
	{
		int max = 0;
		int i;
		for (i = 0;i < str.length();i++)
		{
			max = (str[i].compareTo(str[max]) > 0? i:max);
		}
		return max;
	}

	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String rstr = new String(new char[14]);
		int i;
		while (cin.getline(str,12,' ') && substr = new Scanner(System.in).nextLine())
		{
			for (i = 0;i <= fmax(str);i++)
			{
				rstr = tangible.StringFunctions.changeCharacter(rstr, i, str.charAt(i));
			}
			for (i = 0;i < 3;i++)
			{
				rstr = tangible.StringFunctions.changeCharacter(rstr, fmax(str) + 1 + i, substr.charAt(i));
			}
			for (i = 0;i < str.length() - fmax(str) - 1;i++)
			{
				rstr = tangible.StringFunctions.changeCharacter(rstr, fmax(str) + 4 + i, str.charAt(fmax(str) + i + 1));
			}
			rstr = tangible.StringFunctions.changeCharacter(rstr, fmax(str) + 4 + i, '\0');
			System.out.print(rstr);
			System.out.print("\n");
		}
		return 0;
	}
}

