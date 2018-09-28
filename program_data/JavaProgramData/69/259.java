import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		String a1 = new String(new char[300]);
		String a2 = new String(new char[300]);
		int[] b1 = new int[300];
		int[] b2 = new int[300];
		a1 = new Scanner(System.in).nextLine();
		a2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			b1[i] = 0;
			b2[i] = 0;
		}
		for (i = a1.length() - 1;i >= 0;i--)
		{
			b1[a1.length() - i] = a1.charAt(i) - '0';
		}
		for (i = a2.length() - 1;i >= 0;i--)
		{
			b2[a2.length() - i] = a2.charAt(i) - '0';
		}
		for (i = 1;i < 300;i++)
		{
			b1[i] = b1[i] + b2[i];
			if (b1[i] > 9)
			{
				b1[i] = b1[i] - 10;
				b1[i + 1] = b1[i + 1] + 1;
			}
		}
		for (i = 299;i >= 1;i--)
		{
			if (b1[i] != 0)
			{
				j = i;
				break;
			}
			if (i == 1)
			{
				System.out.print('0');
				return 0;
			}
		}
		for (i = j;i >= 1;i--)
		{
			System.out.print(b1[i]);
		}
		return 0;
	}
}
