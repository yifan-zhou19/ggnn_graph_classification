import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[1000]);
		ch = new Scanner(System.in).nextLine();
		int len;
		int i;
		len = ch.length();
		for (i = 0;i < len - 1;i++)
		{
			if ((ch.charAt(i) >= 'a' && ch.charAt(i) <= 'z') || (ch.charAt(i) >= 'A' && ch.charAt(i) <= 'Z'))
			{
				System.out.print(ch.charAt(i));
			}
			else if ((ch.charAt(i - 1) >= 'a' && ch.charAt(i - 1) <= 'z') || (ch.charAt(i - 1) >= 'A' && ch.charAt(i - 1) <= 'Z'))
			{
				System.out.print(ch.charAt(i));
			}

		}
		System.out.print(ch.charAt(len - 1));
		return 0;
	}

}
