import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		String ch = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (; n > 0; n--)
		{
			ch = new Scanner(System.in).nextLine();
			len = ch.length();
			i = 0;
			if (ch.charAt(0) >= '0' && ch.charAt(0) <= '9')
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			while ((ch.charAt(i) <= 'z' && ch.charAt(i) >= 'a' || ch.charAt(i) <= 'Z' && ch.charAt(i) >= 'A' || ch.charAt(i) >= '0' && ch.charAt(i) <= '9' || ch.charAt(i) == '_') && i < len)
			{
				i++;
			}
			System.out.print((i == len));
			System.out.print("\n");
		}
		return 0;
	}
}

