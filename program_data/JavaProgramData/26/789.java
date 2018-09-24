import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String shuru = new String(new char[500]);
		shuru = new Scanner(System.in).nextLine();
		int i = 0;
		int a = 0;
		int j = 0;
		String p = null;
		a = shuru.length();
		p = shuru;
		System.out.print(shuru.charAt(0));
		for (i = 0; i <= a - 1; i++)
		{
			if (i >= 1)
			{
				if ((shuru.charAt(i) == ' ' && shuru.charAt(i - 1) != ' ') || shuru.charAt(i) != ' ')
				{
					System.out.print(shuru.charAt(i));
				}
			}
		}
		return 0;
	}
}
