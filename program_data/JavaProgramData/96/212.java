import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int l;
		int[] num = new int[101];
		int[] temp = new int[101];
		int t;
		while (a = new Scanner(System.in).nextLine())
		{
			l = a.length();
			for (i = 0; i < l; i++)
			{
				num[i] = a.charAt(i) - '0';
			}
			temp[0] = 0;
			if (l == 2 && 10 * num[0] + num[1] < 13)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(10 * num[0] + num[1]);
				System.out.print("\n");
				return 1;
			}
			if (l == 1)
			{
				System.out.print(0);
				System.out.print("\n");
				System.out.print(num[0]);
				System.out.print("\n");
				return 1;
			}
			for (i = 1; i < l; i++)
			{
				num[i] += 10 * num[i - 1];
				temp[i] = num[i] / 13;
				num[i] %= 13;
			}
			t = num[i - 1];
			for (i = 0; i < l; i++)
			{
				if (temp[i] != 0)
				{
					break;
				}
			}
			for (; i < l; i++)
			{
				System.out.print(temp[i]);
			}
			System.out.print("\n");
			System.out.print(t);
			System.out.print("\n");
		}
		return 0;
	}
}
