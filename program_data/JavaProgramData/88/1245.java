import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		while (i <= a.length())
		{
		if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
		{
			System.out.print(a.charAt(i));
			i++;
		}
		else if (a.charAt(i + 1) <= '9' && a.charAt(i + 1) >= '0')
		{
			System.out.print("\n");
			i++;
		}
		else
		{
			i++;
		}
		}
		return 0;
	}
}
