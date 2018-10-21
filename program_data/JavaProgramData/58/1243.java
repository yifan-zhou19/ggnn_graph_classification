import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String sen = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
			sen = new Scanner(System.in).nextLine();
			if ((sen.charAt(0) == '_') || ((sen.charAt(0) <= 'Z') && (sen.charAt(0) >= 'A')) || ((sen.charAt(0) <= 'z') && (sen.charAt(0) >= 'a')))
			{
				for (i = 1;sen.charAt(i) != '\0';i++)
				{
					if ((sen.charAt(i) == '_') || ((sen.charAt(i) <= 'Z') && (sen.charAt(i) >= 'A')) || ((sen.charAt(i) <= 'z') && (sen.charAt(i) >= 'a')) || ((sen.charAt(i) <= '9') && (sen.charAt(i) >= '0')))
					{
						continue;
					}
					else
					{
						System.out.print("0");
						System.out.print("\n");
						break;
					}
				}
				if (sen.charAt(i) == '\0')
				{
					System.out.print("1");
					System.out.print("\n");
					continue;
				}
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
				continue;
			}
		}
		return 0;
	}
}

