import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[50]);
	  str = new Scanner(System.in).nextLine();
	  int i;
	  int len;
	  len = str.length();
	  for (i = 0;i <= len - 1;i++)
	  {
		if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
		{
			System.out.print(str.charAt(i));
			if (i != len - 1)
			{
				if (str.charAt(i + 1) < '0' || str.charAt(i + 1)>'9')
				{
				System.out.print("\n");
				}
			}
		}
	  }

	return 0;
	}
}
