import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 10000;i++)
		{
			if (a.charAt(i) != ' ')
			{
				System.out.print(a.charAt(i));
				break;
			}
		}
	 int len = a.length();
		for (j = i + 1;j < len;j++)
		{
			if (!((a.charAt(j) == ' ') && a.charAt(j + 1) == ' '))
			{
				System.out.print(a.charAt(j));
			}
		}

		return 0;
	}

}
