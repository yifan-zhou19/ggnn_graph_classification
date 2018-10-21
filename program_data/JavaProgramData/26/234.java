import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String p;
		int i;
		int flag = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			p = str.Substring(i);
			if (p == ' ')
			{
				flag++;
			}
			else
			{
				flag = 0;
			}
			if (flag == 0 || flag == 1)
			{
				System.out.print(p);
			}
		}
		return 0;
	}
}
