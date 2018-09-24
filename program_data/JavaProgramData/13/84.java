package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[20000];
		for (i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(num[0]);
		for (i = 1;i < n;i++)
		{
			int sum = 0;
			for (j = 0;j < i;j++)
			{
				if (num[i] != num[j])
				{
					continue;
				}
				else
				{
					sum++;
				}
			}
			if (sum == 0)
			{
				System.out.print(' ');
				System.out.print(num[i]);
			}
		}
		return 0;
	}
}

