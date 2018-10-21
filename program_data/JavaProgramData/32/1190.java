import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len_a;
		int len_b;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int[] num = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			System.in.read();
			a = new Scanner(System.in).nextLine();
			len_a = a.length();
			b = new Scanner(System.in).nextLine();
			len_b = b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num, 0, (Integer.SIZE / Byte.SIZE));
			for (int i = len_a - 1; i >= 0; i--)
			{
				num[len_a - i] = a.charAt(i) - '0';
			}
			for (int i = len_b - 1; i >= 0; i--)
			{
				int j = len_b - i;
				int b0 = b.charAt(i) - '0';
				if (num[j] >= b0)
				{
					num[j] -= b0;
				}
				else
				{
					num[j + 1]--;
					num[j] = num[j] + 10 - b0;
				}
			}
			int i = 100;
			while (num[i] == 0 && i != 1)
			{
					i--;
			}
			for (int j = i; j >= 1; j--)
			{
				System.out.print(num[j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

