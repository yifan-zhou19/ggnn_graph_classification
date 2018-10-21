import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int n;
	public static int flag = 0;
	public static String str = new String(new char[100]);
	public static char x;
	public static char y;
	public static void paidui(int n)
	{
		int i = 0;
		for (; i < n;i++)
		{
			if (str.charAt(a[i]) == x && str.charAt(a[i + 1]) == y)
			{
				System.out.print(a[i]);
				System.out.print(' ');
				System.out.print(a[i + 1]);
				System.out.print("\n");
				break;
			}
		}
			for (; i < n - 2; i++)
			{
				a[i] = a[i + 2];
			}
			if (n - 2 >= 2)
			{
				paidui(n - 2);
			}
	}
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		n = str.length();
		x = str.charAt(0);
		for (int i = 0; i < n; i++)
		{
			if (str.charAt(i) != x)
			{
				y = str.charAt(i);
				flag = 1;
			}
			if (flag == 1)
			{
				break;
			}
		}
		for (int i = 0; i < n; i++)
		{
			a[i] = i;
		}
		paidui(n);
		return 0;
	}

}
