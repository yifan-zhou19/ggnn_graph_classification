import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int i;
		int len;
		int flag;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
		{
			System.out.print(a.charAt(0));
			flag = 1;
		}
		for (i = 1 ; i <= len - 1 ; i++)
		{
			if (flag == 1)
			{
				if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
				{
					System.out.print(a.charAt(i));
				}
				else
				{
					System.out.print("\n");
					flag = 0;
				}
			}
			else
			{
				if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
				{
					flag = 1;
					System.out.print(a.charAt(i));
				}
			}
		}
		return 0;
	}



}
