import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[32]);
		int i;
		int flag = 0;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) - '0' < 10 && a.charAt(i) - '0' > -1)
			{
				System.out.print(a.charAt(i));
				flag = 1;
			}
			else if (flag == 1)
			{
				System.out.print("\n");
				flag = 0;
			}
		}
		System.out.print("\n");
		return 0;
	}

}
