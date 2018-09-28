import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int i;
	public static String a = new String(new char[210]);
	public static void xiaochu(char x)
	{
		if (x == ' ')
		{
			*(a.Substring(i) + 1) = '0';
			i++;
			xiaochu(*(a.Substring(i) + 1));
		}
	}
	public static int Main()
	{
		int n;
		for (i = 0;i < 210;i++)
		{
			*(a.Substring(i)) = '0';
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 210;i++)
		{
			if (*(a.Substring(i)) == '\0')
			{
				n = i;
				break;
			}
		}
		for (i = 1;i < n;i++)
		{
			if (*(a.Substring(i)) == ' ')
			{
				xiaochu(*(a.Substring(i) + 1));
			}
		}
		for (i = 0;i < n;i++)
		{
			if (*(a.Substring(i)) == '\0')
			{
				System.out.print((a.Substring(i)));
				System.out.print("\n");
			}
			else if (*(a.Substring(i)) != '0')
			{
				System.out.print((a.Substring(i)));
			}
		}
			return 0;
	}

}
