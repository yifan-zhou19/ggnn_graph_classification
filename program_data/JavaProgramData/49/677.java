import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		final String str1 = "";
		final String str2 = "";
		int length;
		int i;
		int j;
		int k;
		int p;
		str = new Scanner(System.in).nextLine();
		length = str.length();
		for (i = 2;i <= length;i++) //i??????????????
		{
			for (j = 0;j <= length - i;j++) //j???????????????
			{
				p = 0;
				for (k = j;k < j + i;k++) //??????i?????????
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, p, str.charAt(k));
					str2 = tangible.StringFunctions.changeCharacter(str2, p, str.charAt(j + i - 1 - (k - j)));
					p++;
				}
				if (strcmp(str1,str2) == 0)
				{
					k = 0;
					while (str1.charAt(k) != '\0')
					{
						System.out.print(str1.charAt(k));
						k++;
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

