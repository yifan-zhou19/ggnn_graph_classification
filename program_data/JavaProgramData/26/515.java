import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		for (int i = 0;i < str.length() - 1;i++)
		{
				if (str.charAt(i) != ' ')
				{
					System.out.print(str.charAt(i));
				}
				else if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
				{
							  System.out.print(str.charAt(i));
				}
				else
				{
					continue;
				}
		}
		System.out.print(str.charAt(str.length() - 1));
		System.out.print("\n");
		return 0;
	}

}
