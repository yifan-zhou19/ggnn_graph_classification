import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int larger(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		return b;
	}
	public static int Main()
	{
		char[] IN_1 = {0};
		char[] IN_2 = {0};
		IN_1 = new Scanner(System.in).nextLine();
		IN_2 = new Scanner(System.in).nextLine();
		int[] input_1 = new int[MAX];
		int[] input_2 = new int[MAX];
		int length_1 = IN_1.length();
		int length_2 = IN_2.length();
		for (int i = 0; i < length_1 ;i++)
		{
			input_1[length_1 - i - 1] = (int)(IN_1[i] - '0');
		}
		for (int i = 0; i < length_2 ;i++)
		{
			input_2[length_2 - i - 1] = (int)(IN_2[i] - '0');
		}
		int[] output = new int[MAX];
		int i = 0;
		for (; i < larger(length_1, length_2); i++)
		{
			int temp = input_1[i] + input_2[i] + output[i];
			output[i + 1] += temp / 10;
			output[i] = temp % 10;
		}
		while (output[i] == 0)
		{
			i--;
		}
		if (i < 0)
		{
			System.out.print(0);
		}
		for (;i >= 0;i--)
		{
			System.out.print(output[i]);
		}
		System.out.print("\n");
		return 0;
	}

}
