import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		i = 0;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) >= 97)
			{
				a.charAt(i) -= 32;
			}
			if (b.charAt(i) >= 97)
			{
				b.charAt(i) -= 32;
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print('>');
				return 0;
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print('<');
				return 0;
			}
			i++;
		}
		System.out.print('=');
		return 0;
	}
}
