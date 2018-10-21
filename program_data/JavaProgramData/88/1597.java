import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int l;
		int flag;
		String c = new String(new char[31]);
		c = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (c.charAt(i) == '\0')
			{
				break;
			}
		}
		l = i;
		String a = c;
		for (i = 0;i < l;i++)
		{
			if (*(a.Substring(i)) >= '0' && *(a.Substring(i)) <= '9')
			{
					System.out.print((a.Substring(i)));
					flag = 0;
			}
			else
			{
				if (flag == 0)
				{
						System.out.print("\n");
						flag = 1;
				}
			}
		}
		return 0;
	}


}
