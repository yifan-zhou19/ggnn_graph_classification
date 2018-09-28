import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[101]);
	public static char boy;
	public static char girl;
	public static int f(int n)
	{
		int i;
		for (i = n; a.charAt(i) != '\0'; i++)
		{
			if (a.charAt(i) == boy)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '0');
				System.out.print(i);
				System.out.print(" ");
				System.out.print(f(i + 1));
				System.out.print("\n");
			}
			else if (a.charAt(i) == girl)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '1');
				return i;
			}
		}
	}
	public static int Main()
	{
		int i;
		a = new Scanner(System.in).nextLine();
		boy = a.charAt(0);
		for (i = 0; a.charAt(i) != '\0'; i++)
		{
			girl = a.charAt(i);
		}
		f(0);
		return 0;
	}
}

