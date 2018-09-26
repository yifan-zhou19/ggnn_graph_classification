import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);
	public static char b;
	public static char g;
	public static void match(int k)
	{
		int i;
		if (str.charAt(k) == '\0')
		{
			return;
		}
		if (str.charAt(k) == g)
		{
			str = tangible.StringFunctions.changeCharacter(str, k, '*');
			for (i = k - 1; i >= 0; i--)
			{
				if (str.charAt(i) == b)
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '*');
					System.out.print(i);
					System.out.print(" ");
					System.out.print(k);
					System.out.print("\n");
					break;
				}
			}
		}
		match(k + 1);
	}

	public static int Main()
	{
		int length;
		str = new Scanner(System.in).nextLine();
		length = str.length();
		b = str.charAt(0);
		g = str.charAt(length - 1);
		match(0);
		return 0;
	}






}

