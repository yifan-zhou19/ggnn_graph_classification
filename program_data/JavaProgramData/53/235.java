package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int temp;
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			temp = num[i];
			for (j = i + 1;j < n;j++)
			{
				if (temp == num[j])
				{
					num[j] = 0;
				}
			}
		}
		for (i = 0;num[i] == 0;i++)
		{
			;
		}
		if (i == n)
		{
			return 0;
		}
		System.out.print(num[i]);
		for (++i;i < n;i++)
		{
			if (num[i] != 0)
			{
				System.out.print(",");
				System.out.print(num[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

