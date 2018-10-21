import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		String a = new String(new char[11]);
		int i;
		int j;
		int k;
		int l;
		int len;
		int p;
		while (cin.get(str,11,' '))
		{
			p = 0;
			k = 0;
			len = str.length();
			System.in.read();
			substr = new Scanner(System.in).nextLine();
			for (i = 0;i < len - 1;i++)
			{
				for (j = i + 1;j < len;j++)
				{
					if (str.charAt(i) > str.charAt(j))
					{
					  if (str.charAt(i) > str.charAt(p))
					  {
						  p = i;
					  }
					}
				}
			}
			for (j = p + 1;j < len;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, k++, str.charAt(j));
			}
			a = tangible.StringFunctions.changeCharacter(a, k, '\0');
			k = 0;
			str = tangible.StringFunctions.changeCharacter(str, p + 1, substr.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, p + 2, substr.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, p + 3, substr.charAt(2));
			for (i = p + 4;i < len + 3;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, a.charAt(k++));
			}
			str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}
}

