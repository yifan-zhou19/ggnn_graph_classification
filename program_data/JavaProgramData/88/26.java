import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		for (i = 0;i < a.length();i++)
		{
			if (i == (a.length() - 1))
			{
				if (('0' <= a.charAt(i)) && (a.charAt(i) <= '9'))
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
				}
						else if (j == 0)
						{
							System.out.print("\n");
							j = 1;
						}
			}
			else if (('0' <= a.charAt(i)) && (a.charAt(i) <= '9'))
			{
				System.out.print(a.charAt(i));
				j = 0;
			}
			else if (j == 0)
			{
				System.out.print("\n");
				j = 1;
			}
		}
		return 0;
	}

}
