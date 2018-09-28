package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[10000000];
	public static int[] flag = new int[10000000];
	public static int len = 1;

	public static void minusn()
	{
		int i;
		flag[0] = 0;
		for (i = 0; i < len; i++)
		{
			num[i] *= 2;
			num[i] += flag[i];
			flag[i + 1] = 0;
			if (num[i] >= 10)
			{
				flag[i + 1] = 1;
				num[i] = num [i] % 10;
			}

		}
		if (flag[i] == 1)
		{
			len++;
			num[i] += flag[i];
		}

		return;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		num[0] = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			minusn();
		}
		for (j = 0, i = len - 1; j < len / 2; j++, i--)
		{
			temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
		for (i = 0; i < len; i++)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");

		return 0;
	}
}

