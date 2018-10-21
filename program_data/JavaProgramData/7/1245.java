import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String sub = new String(new char[256]);
		String rep = new String(new char[256]);
		str = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		int i;
		int j;
		int len1;
		int len2;
		len1 = str.length();
		len2 = sub.length();
		for (i = 0; i <= len1 - len2; i++)
		{
			j = 0;
			while (str.charAt(i + j) == sub.charAt(j) && j < len2)
			{
				j++;
			}
			if (j == len2)
			{
				while (j > 0)
				{
					j--;
					str = tangible.StringFunctions.changeCharacter(str, i + j, rep.charAt(j));
				}
				break;
			}
		}
		System.out.print(str);
		System.out.print("\n");

		return 0;
	}
}

