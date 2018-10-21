import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int i;
		int j;
		int flag = 1;
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		for (i = 0;i < len;i++)
		{
			if (flag == 0 && str.charAt(i) != ' ')
			{
				System.out.print(' ');
			}
			if (str.charAt(i) == ' ')
			{
				flag = 0;
			}
			else
			{
				flag = 1;
				System.out.print(str.charAt(i));
			}
		}
		return 0;
	}
}
