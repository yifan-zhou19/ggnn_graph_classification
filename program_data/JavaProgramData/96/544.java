import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int len;
		int num1;
		int num2;
		int[] a = new int[110];
		int[] b = new int[110];
		char[] ch = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		ch = new Scanner(System.in).nextLine();
		len = ch.length();
		for (i = 0;i < len / 2 * 2 - 1;i += 2)
		{
			a[j] = 10 * (ch[i] - '0') + ch[i + 1] - '0';
			j++;
		}
		if (len % 2 != 0)
		{
			a[j] = ch[len - 1] - '0';
			j++;
		}
		num1 = j;
		for (i = 0;i < num1;i++)
		{
			b[i + 1] += (b[i] + a[i]) % 13 * 100;
			b[i] = (b[i] + a[i]) / 13;
		}
		if (b[0] != 0)
		{
			System.out.print(b[0]);
		}
		else if (num1 == 1)
		{
			System.out.print(b[0]);
		}
		for (i = 1;i < num1 - 1;i++)
		{
			if (b[i] < 10)
			{
				System.out.print(0);
			}
			System.out.print(b[i]);
		}
		if (len > 2)
		{
			if (len % 2 != 0)
			{
				System.out.print(b[num1 - 1]);
			}
			else
			{
				if (b[i] < 10)
				{
					System.out.print(0);
				}
				System.out.print(b[i]);
			}
		}
		System.out.print("\n");
		b[num1] = b[num1] / 100;
		System.out.print(b[num1]);
		System.out.print("\n");
		return 0;
	}
}
