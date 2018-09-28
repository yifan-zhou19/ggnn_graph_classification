import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[251];
		int[] b = new int[251];
		String sa = new String(new char[251]);
		String sb = new String(new char[251]);
		sa = new Scanner(System.in).nextLine();
		sb = new Scanner(System.in).nextLine();
		int len1 = sa.length();
		for (int i = 0; i < len1; i++)
		{
			a[250 - i] = sa.charAt(len1 - i - 1) - '0';
		}
		int len2 = sb.length();
		for (int i = 0; i < len2; i++)
		{
			b[250 - i] = sb.charAt(len2 - i - 1) - '0';
		}
		for (int i = 250; i > 0; i--)
		{
			a[i] += b[i];
			if (a[i] >= 10)
			{
				a[i] -= 10;
				a[i - 1] += 1;
			}
		}
		int flag = 0;
		for (int i = 0; i < 251; i++)
		{
			if (a[i] != 0)
			{
				flag = 1;
			}
			if (flag != 0)
			{
				System.out.print(a[i]);
			}
		}
		if (flag == 0)
		{
			System.out.print(0);
		}
		System.out.print("\n");
	}

}
