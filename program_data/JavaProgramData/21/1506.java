package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] str = new int[301];
		int n;
		int i;
		int j;
		int temp;
		int flag = 0;
		double count = 0;
		double max_num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			str[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n; i >= 2; i--)
		{
			for (j = 2; j <= i; j++)
			{
				if (str[j] < str[j - 1])
				{
					temp = str[j - 1];
					str[j - 1] = str[j];
					str[j] = temp;
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			count += str[i];
		}
		max_num = Math.max(str[n] - count / n, count / n - str[1]);
		for (i = 1; i <= n; i++)
		{
			if (Math.abs(str[i] - count / n) > max_num || Math.abs(Math.abs(str[i] - count / n) - max_num) <= 1e-5)
			{
				if (flag == 0)
				{
				   System.out.print(str[i]);
				   flag = 1;
				}
				else
				{
					System.out.print(",");
					System.out.print(str[i]);
				}
			}
		}
		//while (1);
		return 0;
	}
}

