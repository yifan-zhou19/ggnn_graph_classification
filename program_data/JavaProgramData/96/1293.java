import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int[] b = new int[200];
		int[] c = new int[200];
		int len = a.length();
		for (int i = 0;i < len;i++)
		{
			b[i] = (int)(a.charAt(i) - '0');
		}
		int sum = 0;
		for (int i = 0;i < len - 1;i++)
		{
			if (b[i] >= 13)
			{
				c[sum] = b[i] / 13,b[i + 1] += b[i] % 13 * 10;
				sum++;
			}
			else
			{
				if (sum == 0)
				{
					b[i + 1] += b[i] * 10;
				}
				else
				{
					c[sum] = 0;
					b[i + 1] += b[i] * 10;
					sum++;
				}
			}
		}
		c[sum] = b[len - 1] / 13;
		b[len - 1] %= 13;
		for (int i = 0;i <= sum;i++)
		{
			System.out.print(c[i]);
		}
		System.out.print("\n");
		System.out.print(b[len - 1]);
		System.out.print("\n");






















		return 0;
	}
}
