package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		int[] num1 = new int[101];
		int[] num2 = new int[101];
		int l1;
		int l2;
		int flag = 0;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l1 = str1.length(), l2 = str2.length();
			for (i = 0; i < l1; i++)
			{
				num1[l1 - i - 1] = str1.charAt(i) - '0';
			}

			for (i = 0; i < l2; i++)
			{
				num2[l2 - i - 1] = str2.charAt(i) - '0';
			}
			for (i = 0; i < l1; i++)
			{
				num1[i] = num1[i] - num2[i];
				j = i;
				while (num1[j] < 0)
				{
					num1[j] += 10, num1[j + 1]--;
					j++;
				}
			}
			for (i = l1 - 1; i >= 0 ; i--)
			{
				if (num1[i] == 0 && flag == 0)
				{
					continue;
				}
				flag = 1;
				System.out.print(num1[i]);
			}
			System.out.print("\n");
			for (i = 0; i < l1; i++)
			{
				num1[i] = 0, str1[i] = 0;
			}
			for (i = 0; i < l2; i++)
			{
				num2[i] = 0, str2[i] = 0;
			}
			flag = 0;
		}
		return 0;
	}
}

