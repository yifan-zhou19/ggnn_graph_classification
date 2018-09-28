package <missing>;

public class GlobalMembers
{
	//????????????
	//???2010.12.13
	//??????
	//???1000012856

	public static int Main()
	{
		int n;
		int[] count = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			int i;
			int j;
			int k;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				for (k = 0; k < n; k++)
				{
					if (j == k)
					{
						count[k]++;
					}
				}
			}
		}
		int l;
		int sum = 0;
		for (l = 0; l < n; l++)
		{
			if (count[l] == n - 1)
			{
				System.out.print(l);
				System.out.print("\n");
				sum++;
			}
		}
		if (sum == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}

		return 0;
	}


}

