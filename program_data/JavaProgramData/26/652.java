import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		int flag = 1;
		for (int i = 0; i < l; i++)
		{

			if (a.charAt(i) != ' ')
			{
				System.out.print(a.charAt(i));
				flag = 0;
				continue;
			}
			else if (flag == 0)
			{
				System.out.print(a.charAt(i));
				flag = 1;
				continue;
			}
				else if (flag == 1)
				{
					continue;
				}
		}
		return 0;
	}
}
