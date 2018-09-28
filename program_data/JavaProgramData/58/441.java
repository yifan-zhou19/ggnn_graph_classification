import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n >= 1)
		{
			n--;
			String str = new String(new char[102]);
			str = new Scanner(System.in).nextLine();
			int len;
			int i;
			int j;
			int k;
			len = str.length();
			if (str.charAt(0) != '_')
			{
				if ((str.charAt(0) < 'A') || (str.charAt(0) > 'z') || ((str.charAt(0) > 'Z') && (str.charAt(0) < 'a')))
				{
					System.out.print("0");
					System.out.print("\n");
				}
			}
			if ((str.charAt(0) == '_') || ((str.charAt(0) >= 'A') && (str.charAt(0) <= 'Z')) || ((str.charAt(0) >= 'a') && (str.charAt(0) <= 'z')))
			{
			for (i = 0; i < len; i++)
			{
				if ((str.charAt(i) < '0') || ((str.charAt(i) > 'Z') && (str.charAt(i) < 'a')) || (str.charAt(i) > 'z'))
				{
					if (str.charAt(i) != '_')
					{
					break;
					}
				}
			}
			if (i != len)
			{
				System.out.print("0");
				System.out.print("\n");
			}
			if (i == len)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			}
		}
		return 0;
	}
}

