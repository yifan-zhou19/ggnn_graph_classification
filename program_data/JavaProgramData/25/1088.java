package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] num = new int[40];
		int len = 1;
		int[] plus = new int[40];
		num[1] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= len + 1;j++)
			{
				plus[j + 1] = num[j] * 2 / 10;
				num[j] = (num[j] * 2 + plus[j]) % 10;
			}
			if (num[len + 1] > 0)
			{
				len++;
			}
		}
		for (i = len;i >= 1;i--)
		{
			System.out.print(num[i]);
		}
		return 0;
	}
}

