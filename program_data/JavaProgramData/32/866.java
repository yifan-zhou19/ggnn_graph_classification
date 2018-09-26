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
		int lenth1;
		int lenth2;
		int count;
		int[] num1 = new int[101];
		int[] num2 = new int[101];
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
									// ??/n
		for (count = 1; count <= n; count++) //?????
		{
				System.in.read();
			str1 = new Scanner(System.in).nextLine(); //???????1

			str2 = new Scanner(System.in).nextLine(); //?????2

			lenth1 = str1.length(); //????
			lenth2 = str2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1, 0, (Integer.SIZE / Byte.SIZE)); //???????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2, 0, (Integer.SIZE / Byte.SIZE));
			k = 0;
			for (j = lenth1 - 1; j >= 0; j--)
			{
				num1[k++] = str1.charAt(j) - '0'; //???????????
			}
			k = 0;
			for (j = lenth2 - 1; j >= 0; j--)
			{
				num2[k++] = str2.charAt(j) - '0';
			}
			for (k = 0; k < lenth1; k++)
			{
				if (num1[k] < num2[k]) //???????????
				{
					num1[k] += 10;
					num1[k + 1]--;
				}
				num1[k] -= num2[k];
			}
			i = 100;
			while (num1[i] == 0)
			{
				i--; //?????????????
			}
			for (; i >= 0; i--)
			{
				System.out.print(num1[i]);
			}
			System.out.print("\n");
		}


		return 0;
	}

}

