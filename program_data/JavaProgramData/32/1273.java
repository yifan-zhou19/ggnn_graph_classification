import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] num1 = new int[110];
		int[] num2 = new int[110];
		String str1 = new String(new char[110]);
		String str2 = new String(new char[110]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
			j = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2, 0, (Integer.SIZE / Byte.SIZE));
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			System.in.read();
			int l1 = str1.length();
			int l2 = str2.length();
			for (k = l1 - 1; k >= 0; k--)
			{
				num1[j++] = str1.charAt(k) - '0';
			}
			j = 0;
			for (k = l2 - 1; k >= 0; k--)
			{
				num2[j++] = str2.charAt(k) - '0';
			}
			for (k = 0; k < l2 || k < l1; k++)
			{
				num1[k] -= num2[k];
				if (k > 0 && num1[k - 1] < 0)
				{
					num1[k - 1] += 10;
					--num1[k];
				}
			}
			k = 100;
			while (k > 0 && num1[k] == 0)
			{
				--k;
			}
			for (; k >= 0; k--)
			{
				System.out.print(num1[k]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

