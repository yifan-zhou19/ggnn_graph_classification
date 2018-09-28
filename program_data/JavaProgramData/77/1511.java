import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void getmarried(String str, int num, char b, char g, int l)
	{
		if (str[num].equals(g))
		{
			for (int j = num - 1 ; j >= 0 ; j--)
			{
				if (str[j].equals(b))
				{
					System.out.print(j);
					System.out.print(' ');
					System.out.print(num);
					System.out.print("\n");
					str[num] = str[j] = '#';
					break;
				}
			}
		}
		if (num < l - 1)
		{
			return getmarried(str, num + 1, b, g, l);
		}
	}
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		int l = str.length();

		char b = str.charAt(0);
		char g = str.charAt(l - 1);

		getmarried(str, 1, b, g, l);
	}
}
