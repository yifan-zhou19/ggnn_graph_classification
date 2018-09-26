import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) >= '0') && (a.charAt(i) <= '9'))
			{
				System.out.print(a.charAt(i));
			}
			else
			{
				if (i != 0)
				{
					System.out.print("\n");
				}
				while (true)
				{
				if (((a.charAt(i + 1) < '0') || (a.charAt(i + 1)>'9')) && ((i + 1) <= 33))
				{
					i++;
				}
				else
				{
					break;
				}
				}
			}
		}

		return 0;
	}



}
