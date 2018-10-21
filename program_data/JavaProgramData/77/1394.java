import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[101]);
	public static int match(int n,char a, char b)
	{
		for (int i = 1;i < n;i++)
		{
			if (str.charAt(i) != b)
			{
				continue;
			}
			for (int j = i - 1;j >= 0;j--)
			{
				if (str.charAt(j) == a)
				{

					System.out.print(j);
					System.out.print(' ');
					System.out.print(i);
					System.out.print("\n");
					str = tangible.StringFunctions.changeCharacter(str, j, '*');
					break;
				}
			}

		}
		return 0;
	}
	public static int Main()
	{
		int i;
		char a;
		char b;
		str = new Scanner(System.in).nextLine();
		i = str.length();
		a = str.charAt(0);
		b = str.charAt(i - 1);
		match(i, a, b);
		return 0;
	}




}

