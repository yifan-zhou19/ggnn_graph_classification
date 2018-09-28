import java.util.*;

package <missing>;

public class GlobalMembers
{
	// * * * * * * * * * * * * * * *
	// *????????           *
	// *??????  1300013011   *
	// *???2013.11.16           *
	// * * * * * * * * * * * * * * *
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len1;
		int len2;
		int[] num1 = new int[101];
		int[] num2 = new int[101];
		int[] num = new int[101];
		String str1 = new String(new char[200]);
		String str2 = new String(new char[200]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1; i <= n; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num, 0, (Integer.SIZE / Byte.SIZE));
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			if (i != n)
			{
				System.in.read();
			}
			len1 = str1.length();
			len2 = str2.length();
			for (j = 0, k = len1 - 1; k >= 0; j++, k--)
			{
				num1[j] = str1.charAt(k) - '0';
			}
			for (j = 0, k = len2 - 1; k >= 0; j++, k--)
			{
				num2[j] = str2.charAt(k) - '0';
			}
			for (j = 0; j < len1; j++)
			{
				if (num1[j] >= num2[j])
				{
					num[j] = num1[j] - num2[j];
				}
				else
				{
					num[j] = num1[j] + 10 - num2[j];
					k = j + 1;
					while (num1[k] == 0)
					{
						num1[k] = 9;
						k++;
					}
					num1[k]--;
				}
			}
			for (j = len1 - 1; j >= 0; j--)
			{
				if (num[j] != 0)
				{
					for (k = j; k >= 0; k--)
					{
						System.out.print(num[k]);
					}
					break;
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

