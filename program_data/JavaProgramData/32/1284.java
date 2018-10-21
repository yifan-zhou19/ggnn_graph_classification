import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num1 = new int[101];
		int[] num2 = new int[101];
		int len1;
		int len2;
		int m;
		int j;
		String str1 = new String(new char[102]);
		String str2 = new String(new char[102]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int k = 1; k <= n; k++)
		{
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
					System.in.read();
			len1 = str1.length();
			len2 = str2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2, 0, (Integer.SIZE / Byte.SIZE));
			j = 0;
			for (int i = len1 - 1; i >= 0; i--)
			{
				num1[j] = str1.charAt(i) - '0';
				j++;
			}
			j = 0;
			for (int i = len2 - 1; i >= 0; i--)
			{
				num2[j] = str2.charAt(i) - '0';
				j++;
			}
			for (int i = 0; i < len1; i++)
			{
				num1[i] = num1[i] - num2[i];
				if (num1[i] < 0)
				{
					num1[i + 1]--;
					num1[i] += 10;
				}
			}
			m = len1;
			while (num1[m] == 0)
			{
				m--;
			}
			for (int i = m; i >= 0; i--)
			{
				System.out.print(num1[i]);
			}
			System.out.print("\n");
		}

		return 0;

	}
}

