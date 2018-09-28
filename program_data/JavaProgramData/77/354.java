import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*        ????
	??????     2010.12.29            */

	public static int Main()
	{
		int i;
		int len;
		int j;
		int[] sta = new int[10000]; //????????? 1boy 2girl 0??
		final String lin = ""; //????
		char boy;
		char girl;
		lin = new Scanner(System.in).nextLine();
		len = lin.length();
		boy = lin.charAt(0); //?????
		girl = lin.charAt(len - 1); //?????

		for (i = 0;i < len;i++)
		{
			sta[i] = lin.charAt(i) == boy?1:2; //??????
		}
		for (i = 0;i < len;i++)
		{
			if (sta[i] == 2)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (sta[j] == 1)
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						sta[i] = sta[j] = 0;
						break;
					}
				}
			}
		}
		return 0;
	}
}
