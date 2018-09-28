import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len;
		String str = new String(new char[1000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
			str = new Scanner(System.in).nextLine();
			len = str.length();
			if (str.charAt(0) == '_' || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))
			{
				if (len == 1)
				{
					System.out.print("1");
					System.out.print("\n");
				}
				else
				{
					for (i = 1;i < len;i++)
					{
						if (str.charAt(i) == '_' || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) <= '9' && str.charAt(i) >= '0'))
						{
							;
						}
						else
						{
							break;
						}
					}
					if (i == len)
					{
						System.out.print("1");
						System.out.print("\n");
					}
					else
					{
						System.out.print("0");
						System.out.print("\n");
					}
				}
			}
			else
			{
				System.out.print("0");
				System.out.print("\n");
			}

		}
		return 0;
	}
}

