package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 1 ; k <= n ; k++)
		{
			String str1 = new String(new char[200]);
			String str2 = new String(new char[200]);
			int[] num1 = new int[200];
			int[] num2 = new int[200];
			int[] num = new int[200];
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len1 = str1.length();
			int len2 = str2.length();
			for (int i = len1 - 1 ; i >= 0 ; i--)
			{
				num1[i] = str1.charAt(i) - '0';
			}
			for (int i = len1 - 1, j = len2 - 1 ; j >= 0 ; i--, j--)
			{
				num2[i] = str2.charAt(j) - '0';
			}
			for (int i = len1 - 1 ; i >= 0 ; i--)
			{
				if (num1[i] >= num2[i])
				{
					num[i] = num1[i] - num2[i];
				}
				else
				{
					num[i] = 10 + num1[i] - num2[i];
					for (int a = 1 ; a <= i ; a++)
					{
						if (num1[i - a] == 0)
						{
							num1[i - a] = 9;
							continue;
						}
						num1[i - a]--;
						break;
					}
				}
			}
				int b = 0;
				while (num[b] == 0)
				{
					b++;
				}
				for (; b <= len1 - 1 ; b++)
				{
					System.out.print(num[b]);
				}
				System.out.print("\n");
		}

		return 0;
	}
}

