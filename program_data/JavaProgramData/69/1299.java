import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String inputA = new String(new char[260]);
	public static String inputB = new String(new char[260]);
	public static int[] a = new int[260];
	public static int[] b = new int[260];

	public static int Main()
	{
		inputA = new Scanner(System.in).nextLine();
		inputB = new Scanner(System.in).nextLine();

		int alen = inputA.length();
		int blen = inputB.length();
		for (int i = alen - 1, j = 0; i >= 0; i--, j++)
		{
			a[j] = inputA.charAt(i) - '0';
		}
		for (int i = blen - 1, j = 0; i >= 0; i--, j++)
		{
			b[j] = inputB.charAt(i) - '0';
		}

		int len = Math.max(alen, blen);
		for (int i = 0; i < len; i++)
		{
			b[i] += a[i];
			if (b[i] >= 10)
			{
				b[i] -= 10;
				b[i + 1] += 1;
			}
		}

		int index = 0;
		for (int i = 259; i >= 0; i--)
		{
			if (b[i] > 0)
			{
				index = i;
				break;
			}
		}

		for (int i = index; i >= 0; i--)
		{
			System.out.print(b[i]);
		}
		System.out.print("\n");
		return 0;
	}
}
