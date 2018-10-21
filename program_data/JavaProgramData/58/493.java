import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[81]);
		int i;
		int j;
		int n;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i < n; i++)
		{
			p = 1;
			str = new Scanner(System.in).nextLine();
			if ((str.charAt(0) == '_') || ((str.charAt(0) >= 'a') && (str.charAt(0) <= 'z')) || ((str.charAt(0) >= 'A') && (str.charAt(0) <= 'Z')))
			{
				for (j = 1; ; j++)
				{
					if (str.charAt(j) == '\0')
					{
						break;
					}
					else if ((str.charAt(j) == '_') || ((str.charAt(j) >= 'a') && (str.charAt(j) <= 'z')) || ((str.charAt(j) >= 'A') && (str.charAt(j) <= 'Z')) || ((str.charAt(j) >= '0') && (str.charAt(j) <= '9')))
					{
							p = 1;
					}
						else
						{
							p = 0;
							break;
						}
				}
					System.out.print(p);
					System.out.print("\n");
			}
			else
			{
				System.out.print('0');
				System.out.print("\n");
			}
		}
		return 0;
	}
}

