package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int counter = 0;
		int[] num = new int[110001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 110000;i++)
		{
			num[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (num[i] == k)
			{
				for (j = i;j <= n - counter;j++)
				{
					num[j] = num[j + 1];
				}
				counter++;
				i--;
			}
		}
		for (i = 1;i <= n - counter - 1;i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[n - counter]);
		return 0;
	}
}

