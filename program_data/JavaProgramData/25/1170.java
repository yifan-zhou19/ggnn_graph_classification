package <missing>;

public class GlobalMembers
{
	// 2011???.cpp : ??????????????

	public static int[] num = new int[100000];
	public static void plu()
	{
		int[] sub = new int[100000];
		for (int i = 0;i < 110;i++)
		{
			sub[i] = 0;
		}
		int k = 0;
		while (num[k] != -1)
		{
			sub[k] = num[k] * 2 % 10 + sub[k];
			sub[k + 1] = num[k] * 2 / 10;
			k++;
		}
		int j = 60;
		while (sub[j] == 0)
		{
				j--;
		}
		for (int m = j;m > -1;m--)
		{
			num[m] = sub[m];
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print(2);
			return 0;
		}
		if (n == 0)
		{
			System.out.print(1);
			return 0;
		}
		for (int i = 0;i < n;i++)
		{
			num[i] = -1;
		}
		num[0] = 1;
		for (int j = 0;j < n;j++)
		{
			plu();
		}
		int k = 0;
		while (num[k] != -1)
		{
			k++;
		}
		for (int l = k - 1;l > -1;l--)
		{
			System.out.print(num[l]);
		}

		return 0;
	}
}

