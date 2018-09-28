import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[101]);
		ch = new Scanner(System.in).nextLine();
		char b = ch.charAt(0);
		char g = ch.charAt(0);
		for (int i = 0;g == b;i++)
		{
			g = ch.charAt(i);
		}
		int length = ch.length();
		int gnum = 0;
		for (int i = 0;i < (length / 2);i++)
		{
			for (gnum++;ch.charAt(gnum) == b;gnum++)
			{
				;
			}
			int k = 1;
			int j;
			for (j = gnum - 1;k > 0;j--)
			{
				if (ch.charAt(j) == b)
				{
					k--;
				}
				else
				{
					k++;
				}
			}
			System.out.print(j + 1);
			System.out.print(" ");
			System.out.print(gnum);
			System.out.print("\n");
		}
		return 0;
	}

}
