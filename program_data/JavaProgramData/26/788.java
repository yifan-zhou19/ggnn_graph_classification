import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num = 0;
		String str = new String(new char[105]);
		str = new Scanner(System.in).nextLine();
		String p = str;
		for (i = 0;i < str.length();i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
					System.out.print((p.Substring(i)));
					num = 0;
			}
			if (*(p.Substring(i)) == ' ' && num == 0)
			{
					System.out.print(' ');
					num++;
			}

		}
		return 0;
	}



}
