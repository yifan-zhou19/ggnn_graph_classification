import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[50]);
		int i;
		str = new Scanner(System.in).nextLine();
		for (i = 0 ; str.charAt(i) != '\0' ; i++)
		{
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				if (str.charAt(i - 1) >= 48 && str.charAt(i - 1) <= 57)
				{
					System.out.print("\n");
				}
			}
		}
		System.out.print("\n");
		return 0;
	}


}
