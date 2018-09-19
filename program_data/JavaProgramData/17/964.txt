import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[101]);
	public static String b = new String(new char[101]);
	public static int l;
	public static int[] c = new int[101];
	public static int Main()
	{
		int i;
		int j;
		while (a = new Scanner(System.in).nextLine())
		{
			j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c,0,(Integer.SIZE / Byte.SIZE));
			l = a.length();
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
					c[j] = i;
					j = j + 1;
				}
				else if (a.charAt(i) == ')')
				{
					if (j >= 1)
					{
						b = tangible.StringFunctions.changeCharacter(b, c[j - 1], ' ');
						b = tangible.StringFunctions.changeCharacter(b, i, ' ');
						j = j - 1;
					}
					else
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '?');
					}
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, l, '\0');
			System.out.print(a);
			System.out.print("\n");
			System.out.print(b);
			System.out.print("\n");
		}
		return 0;
	}

}

