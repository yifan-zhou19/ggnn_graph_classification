import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			String sen = new String(new char[81]);
			sen = new Scanner(System.in).nextLine();
			int sl = 0;
			sl = sen.length();

			int k = 0;
			for (k = 0; k < sl; k++)
			{
				if (k == 0)
				{
					if ((('a' <= sen.charAt(k)) && (sen.charAt(k) <= 'z')) || (('A' <= sen.charAt(k)) && (sen.charAt(k) <= 'Z')) || (sen.charAt(k) == '_'))
					{
						continue;
					}
					else
					{
						break;
					}
				}
				else
				{
					if ((('a' <= sen.charAt(k)) && (sen.charAt(k) <= 'z')) || (('A' <= sen.charAt(k)) && (sen.charAt(k) <= 'Z')) || (sen.charAt(k) == '_') || (('0' <= sen.charAt(k)) && (sen.charAt(k) <= '9')))
					{
						continue;
					}
					else
					{
						break;
					}
				}
			}

			if (k == sl)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}

	return 0;
	}
}

