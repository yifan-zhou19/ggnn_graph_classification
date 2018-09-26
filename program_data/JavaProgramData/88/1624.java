import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[31]);
		int i;
		int len;
		ch = new Scanner(System.in).nextLine();
		len = ch.length();
		for (i = 0 ; i <= len - 2 ; i++)
		{
			if ((ch.charAt(i) >= 48) && (ch.charAt(i) <= 57))
			{
				if ((ch.charAt(i + 1) >= 48) && (ch.charAt(i + 1) <= 57))
				{
					System.out.print(ch.charAt(i));
				}
				else
				{
					System.out.print(ch.charAt(i));
					System.out.print("\n");
				}
			}
		}
		if ((ch.charAt(len - 1) >= 48) && (ch.charAt(len - 1) <= 57))
		{
			System.out.print(ch.charAt(len - 1));
			System.out.print("\n");
		}
		return 0;
	}
}
