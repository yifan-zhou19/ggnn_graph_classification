import java.util.*;

package <missing>;

public class GlobalMembers
{
	//@@@@???????@@@@@@@@@@@//
	//@@@@?????@@@@@@@@@@@@@@@//
	//@@@@???12/11@@@@@@@@@@@@@@//
	public static int Main()
	{
		String str = new String(new char[31]);
		int i;
		int j;
		int l;
		int[] a = new int[31];
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (j = '0';j <= '9';j++)
		{
			if (str.charAt(0) == j)
			{
				System.out.print(str.charAt(0));
				a[0] = 1;
				break;
			}
		}
		for (i = 1;i < l;i++)
		{
			for (j = '0';j <= '9';j++)
			{
				if (str.charAt(i) == j)
				{
					System.out.print(str.charAt(i));
					a[i] = 1;
					break;
				}
			}
			if (a[i - 1] == 1 && j == '9' + 1)
			{
				System.out.print("\n");
			}
		}
	}
}
