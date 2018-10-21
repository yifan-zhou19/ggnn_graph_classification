package <missing>;

public class GlobalMembers
{
	public static final int MAX = 260;
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;
		int carry = 0; //????
		int temp = 0;
		int len1 = 0;
		int len2 = 0;
		int bigger = 0;
		String ch1 = new String(new char[MAX]);
		String ch2 = new String(new char[MAX]);
		int[] num1 = new int[MAX];
		int[] num2 = new int[MAX];
		int[] result = new int[MAX];
		ch1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		ch2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = ch1.length();
		len2 = ch2.length();
		if (len1 > len2)
		{
			bigger = len1;
		}
		else
		{
			bigger = len2;
		}
		for (j = 0;j < MAX;j++)
		{
			num1[j] = num2[j] = result[j] = 0;
		}
		for (i = 0;i <= len1 - 1;i++)
		{
			num1[MAX - len1 + i] = ch1.charAt(i) - '0';
		}
		for (i = 0;i <= len2 - 1 ;i++)
		{
			num2[MAX - len2 + i] = ch2.charAt(i) - '0';
		}
		for (k = MAX - 1;k >= MAX - bigger;k--)
		{
			carry = 0;
			temp = num1[k] + num2[k] + result[k];
			if (temp < 10)
			{
				result[k] = temp;
				carry = 0;
			}
			else
			{
				result[k] = temp % 10;
				carry = 1;
			}
			result[k - 1] = result[k - 1] + carry;
		}
		for (l = 0;(l <= MAX - 1) && (result[l] == 0);l++)
		{
			;
		}
		if (l == MAX)
		{
			System.out.print('0');
		}
		else
		{
			for (i = l;i <= MAX - 1;i++)
			{
				System.out.print(result[i]);
			}
		}
		return 0;
	}
}

