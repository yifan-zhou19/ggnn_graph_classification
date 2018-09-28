import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	// ????1.cpp
	// ?????????
	// ?????? 1200012943
	// ??:2012.12.26
	//
	public static int Main()
	{
		int len1 = 0;
		int len2 = 50;
		int len = 0;
		String str = new String(new char[2000]);
		String w1 = new String(new char[50]);
		String w2 = new String(new char[50]);
		str = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int k;
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			if (str.charAt(i) != ' ' && str.charAt(i) != ',')
			{
				len++;
			}
			else
			{
				if (len > len1)
				{
					len1 = len;
					int m = 0;
					for (k = j; k < i; k++)
					{
						w1 = tangible.StringFunctions.changeCharacter(w1, m++, str.charAt(k));
					}
					w1 = tangible.StringFunctions.changeCharacter(w1, m, '\0');
				}
				if (len < len2)
				{
					len2 = len;
					int n = 0;
					for (k = j; k < i; k++)
					{
						w2 = tangible.StringFunctions.changeCharacter(w2, n++, str.charAt(k));
					}
					w2 = tangible.StringFunctions.changeCharacter(w2, n, '\0');
				}
				len = 0;
				if (str.charAt(i) == ',')
				{
					i++;
				}
				j = i + 1;
			}
		}
		if (len > len1)
		{
			int m = 0;
			for (k = j; k < i; k++)
			{
				w1 = tangible.StringFunctions.changeCharacter(w1, m++, str.charAt(k));
			}
			w1 = tangible.StringFunctions.changeCharacter(w1, m, '\0');
		}
		if (len > 0 && len < len2)
		{
			int n = 0;
			for (k = j; k < i; k++)
			{
				w2 = tangible.StringFunctions.changeCharacter(w2, n++, str.charAt(k));
			}
			w2 = tangible.StringFunctions.changeCharacter(w2, n, '\0');
		}
		System.out.print(w1);
		System.out.print("\n");
		System.out.print(w2);
		System.out.print("\n");
		return 0;
	}

}

