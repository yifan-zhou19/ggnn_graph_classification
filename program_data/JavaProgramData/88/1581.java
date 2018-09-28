import java.util.*;

package <missing>;

public class GlobalMembers
{
	//@@@@???????@@@@@@@@@@@//
	//@@@@?????@@@@@@@@@@@@@@@//
	//@@@@???12/11@@@@@@@@@@@@@@//
	public static int Main()
	{
		String str = new String(new char[31]); // ??????
		int i; // l???????????????a[31]????????
		int j;
		int l;
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] p = a;
		str = new Scanner(System.in).nextLine(); // ?????
		l = str.length(); // ????????
		for (j = '0'; j <= '9'; j++)
		{
			if (str.charAt(0) == j)
			{
				System.out.print(str.charAt(0));
				p[0] = 1;
				break;
			}
		} // ?????????
		for (i = 1; i < l; i++)
		{
			for (j = '0'; j <= '9'; j++)
			{
				if (str.charAt(i) == j)
				{
					System.out.print(str.charAt(i));
					p[i] = 1;
					break;
				}
			}
			if (p[i - 1] == 1 && j == '9' + 1)
			{
				System.out.print("\n");
			}
		}
	}
}
