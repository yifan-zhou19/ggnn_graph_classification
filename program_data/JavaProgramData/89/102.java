package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] flag = new int[10000];
		int[] num = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			flag[i] = 1;
			num[j]++;
		}

		for (i = 0;i < n; i++)
		{
			if (flag[i] == 0)
			{
				if (num[i] == n - 1)
				{
					System.out.print(i);
					System.out.print("\n");
				}
				else
				{
					System.out.print("NOT FOUND");
					System.out.print("\n");
				}
				break;
			}

		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}

		return 0;
	}

}

