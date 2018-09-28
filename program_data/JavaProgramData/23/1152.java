import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[5000]);
		String str2 = new String(new char[5000]);
		int len = 0;
		int start;
		int end;
		int l;
		int i;
		int j;
		str1 = new Scanner(System.in).nextLine();
		l = str1.length();
		for (i = 0;i < l;i++)
		{
			if (str1.charAt(i) != 0)
			{
				len++;
			}
			if (str1.charAt(i) == ' ')
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, l - 1 - i, ' ');
				end = i - 1;
				start = i - len + 1;
				for (j = l - 1 - end;j <= l - 1 - start;j++)
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j, str1.charAt(j + 1 + end + start - l));
				}
				len = 0;
			}
		}
		for (i = 0;i < len;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, str1.charAt(l - len + i));
		}
		for (i = 0;i < l;i++)
		{
			System.out.print(str2.charAt(i));
		}
		return 0;
	}

}

