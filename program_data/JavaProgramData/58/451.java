import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]); //a???????
		int n; //n??????
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = new Scanner(System.in).nextLine();
		for (;n > 0;n--)
		{
			a = new Scanner(System.in).nextLine();
			for (i = 0;a.charAt(i) != 0;i++)
			{
				if (i == 0)
				{
					if (a.charAt(i) == '_' || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
					{
						continue;
					}
					else
					{
						System.out.print('0');
						System.out.print("\n");
						break;
					}
				}
				else if (a.charAt(i) == '_' || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9'))
				{
					continue; //??????????
				}
				else
				{
					System.out.print('0');
					System.out.print("\n");
					break;
				}
			}
			if (a.charAt(i) == 0)
			{
				System.out.print('1');
				System.out.print("\n");
			}
		}
		return 0;
	}
}

