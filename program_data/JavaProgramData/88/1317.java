import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int function(int n)
	{

	}
	public static int Main()
	{
		String str = new String(new char[30]);
		str = new Scanner(System.in).nextLine();
		int i = 0;
		int n = str.length();
		for (i = 0; i < n; i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9' && str.charAt(i - 1) != '-')
			{
				System.out.print(str.charAt(i));
			}
			else if (i == 0 || (str.charAt(i - 1) < '0' || str.charAt(i - 1)>'9'))
			{
				continue;
			}
			else
			{
				System.out.print("\n");
			}
		}
	   return 0;
	}

}
