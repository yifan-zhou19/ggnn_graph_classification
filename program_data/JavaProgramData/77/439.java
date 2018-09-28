import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
				? ? ??????
				?????20110102
				?    ?????
				?????????????????
	**/
	public static void check(int[] a)
	{
		for (int i = 0; i < g_lenth; i++)
		{
			if (a[i] == 2)
			{
				for (int j = i - 1; j >= 0; j--)
				{
					if (a[j] == 1)
					{
						System.out.print(j);
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");
						a[i] = 0;
						a[j] = 0;
						return check(a);
					}
				}
			}
		}
	}
	public static int g_lenth;
	public static int Main()
	{
		String a = new String(new char[101]);
		int[] b = new int[100];
		a = new Scanner(System.in).nextLine();
		g_lenth = a.length();
		for (int i = 0; i < g_lenth; i++)
		{
			if (a.charAt(i) == a.charAt(0))
			{
				b[i] = 1;
			}
			else
			{
				b[i] = 2;
			}
		}
		check(b);
		return 0;
	}
}
