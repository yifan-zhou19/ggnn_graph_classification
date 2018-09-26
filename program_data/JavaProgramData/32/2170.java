package <missing>;

public class GlobalMembers
{
	public static int[] num1 = new int[101];
	public static int[] num2 = new int[101];
	public static String char1 = new String(new char[101]);
	public static String char2 = new String(new char[101]);

	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= 100;j++)
			{
				num1[j] = 0;
				num2[j] = 0;
			}
			char1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			char2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len1;
			int len2;
			for (len1 = 0;char1.charAt(len1) != '\0';len1++)
			{
				;
			}
			for (len2 = 0;char2.charAt(len2) != '\0';len2++)
			{
				;
			}

			for (j = 1;j <= len1;j++)
			{
				num1[j] = char1.charAt(len1 - j) - 48;
			}
			for (j = 1;j <= len2;j++)
			{
				num2[j] = char2.charAt(len2 - j) - 48;
			}

			for (j = 1;j <= len1;j++)
			{
				num1[j] = num1[j] - num2[j];
			}

			for (j = 1;j <= len1;j++)
			{
				if (num1[j] < 0)
				{
					num1[j] = num1[j] + 10;
					num1[j + 1]--;
				}
			}
			int flag = 0;
			for (j = 0;j < len1;j++)
			{
				if (num1[len1 - j] != 0)
				{
					flag = 1;
				}
					System.out.print(num1[len1 - j]);
			}
			if (flag == 0)
			{
				System.out.print(0);
			}
			if (i != n)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

