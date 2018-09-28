import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[101]);
	public static char boy;
	public static char girl;
	public static void paidui()
	{
		for (int i = 1;i < l;i++)
		{
			if (str.charAt(i) == boy)
			{
				int x = 1;
				while (str.charAt(i + x) == '\0')
				{
					x++;
				}
				if (str.charAt(i + x) == girl)
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(i + x);
					System.out.print("\n");
				str = tangible.StringFunctions.changeCharacter(str, i, str[i + x] = '\0');
				break;
				}
			}
		}
	}
	public static int l;
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		boy = str.charAt(0);
		for (int i = 1;;i++)
		{
			if (str.charAt(i) != boy)
			{
				girl = str.charAt(i);
				break;
			}
		}
		for (int i = 0;str.charAt(i) != '\0';i++)
		{
			l = i;
		}
		for (int i = 0;i <= l;i++)
		{
			paidui();
		}
		System.out.print(0);
		System.out.print(' ');
		System.out.print(l);
		return 0;
	}
}

