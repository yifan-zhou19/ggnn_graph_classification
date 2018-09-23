import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[201]);
		String ch = new String(new char[201]);
		String ch1 = new String(new char[201]);
		String str1 = new String(new char[201]);
		int s;
		int s1;
		int s2;
		int i;
		int j;
		int g = 0;
		int k;
		str = new Scanner(System.in).nextLine();
		ch = new Scanner(System.in).nextLine();
		ch1 = new Scanner(System.in).nextLine();
		s = str.length();
		s1 = ch.length();
		s2 = ch1.length();
		str1 = str;
		for (i = 0;i < s;i++)
		{
			g = 0;
			if (str.charAt(i) == ch.charAt(0) && ((i == 0) || (str.charAt(i - 1) == ' ')))
			{
				for (j = i;j < s1 + i;j++)
				{
					if (str.charAt(j) == ch.charAt(j - i))
					{
						g++;
					}
				}
				if (g == s1 && (str.charAt(s1 + i) == ' ' || str.charAt(s1 + i) == '\0'))
				{
					for (k = 0;k < i;k++)
					{
						str1 = tangible.StringFunctions.changeCharacter(str1, k, str.charAt(k));

					}
					for (k = i;k < i + s2;k++)
					{
						str1 = tangible.StringFunctions.changeCharacter(str1, k, ch1.charAt(k - i));
					}
					for (k = i + s2;k <= s + s2 - s1;k++)
					{
						str1 = tangible.StringFunctions.changeCharacter(str1, k, str.charAt(k + s1 - s2));
					}
					for (k = 0;k <= s + s2 - s1;k++)
					{
						str = tangible.StringFunctions.changeCharacter(str, k, str1.charAt(k));
					}
					s = s + s2 - s1;
				}
			}

		}
		System.out.print(str1);
		System.out.print("\n");

	return 0;
	}


}

