package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int t;
		int m;
		int del;
		int x;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[100001];
		for (i = 0;i <= n - 1;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		del = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = n;m <= 100001;m++)
		{
				num[m] = del;
		}
		for (x = 0;x <= n - 1;x++)
		{
				if (num[x] == del)
				{
					sum = sum + 1;
				}
		}
		for (j = n - 1;j >= 0;j--)
		{
			if (num[j] == del)
			{
				for (s = j;s <= n - 1;s++)
				{
					num[s] = num[s + 1];
				}
			}
		}
		System.out.print(num[0]);
		for (t = 1;t <= n - sum - 1;t++)
		{
			System.out.print(" ");
			System.out.print(num[t]);
		}
		return 0;
	}

}

