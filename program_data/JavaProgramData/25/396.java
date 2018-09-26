package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int flag = 0;
		int[] num = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 1;
		for (i = 1; i <= n; i++)
		{

			for (j = 0 ; j <= k; j++)
			{
				num[j] = num[j] * 2 + flag;
				flag = 0;
				if (num[j] >= 10)
				{
					num[j] = num[j] - 10;
					flag = 1;
				}
			}
			if (flag == 1)
			{
				k++;
				num[k] = 1;
				flag = 0;
			}
		}
		for (i = k ; i >= 0 ; i--)
		{
			System.out.print(num[i]);
		}
		return 0;

	}
}

