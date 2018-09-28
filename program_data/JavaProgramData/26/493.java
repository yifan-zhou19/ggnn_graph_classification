import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int l;
		int i;
		int flag = 0;
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (flag == 0)
			{
				System.out.print(a.charAt(i));
				if (a.charAt(i) == ' ')
				{
					flag = 1;
				}
			}
			else
			{
				if (a.charAt(i) != ' ')
				{
					flag = 0;
					i--;
				}
			}
		}
				System.out.print("\n");
	}



}
