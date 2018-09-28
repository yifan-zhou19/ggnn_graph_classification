import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		str = new Scanner(System.in).nextLine();
		int i;
		int flag = 1;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ' && flag == 1)
			{
				System.out.print(str.charAt(i));
				flag = 0;
			}
			else if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
				flag = 1;
			}
			else
			{
				;
			}
		}
		System.out.print("\n");
		return 0;
	}


}
