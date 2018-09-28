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
		int[] num1 = new int[101];
		int[] num2 = new int[101];
		int[] res = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		for (i = 0 ;i < n ;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(res, 0, (Integer.SIZE / Byte.SIZE));
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			System.in.read();
			for (j = 0 ; j < str2.length() ; j++)
			{
				num2[j] = str2.charAt(str2.length() - j - 1) - '0';
			}
			for (j = 0 ; j < str1.length() ; j++)
			{
				num1[j] = str1.charAt(str1.length() - j - 1) - '0';
			}
			for (k = 0 ; k < str1.length() ; k++)
			{
				if (num1[k] - num2[k] < 0)
				{
					res[k] = num1[k] - num2[k] + 10;
					num1[k + 1]--;
				}
				else
				{
					res[k] = num1[k] - num2[k];
				}
			}
			for (k = str1.length() - 1 ; k >= 0 ; k--)
			{
				if (res[k] == 0)
				{
					continue;
				}
				break;
			}
			while (k >= 0)
			{
				System.out.print(res[k]);
				k--;
			}
			System.out.print("\n");
		}
		return 0;
	}



}

