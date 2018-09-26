package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int cnt;
		int[] num = new int[330];
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			cnt = n;
			for (i = 1; i <= n; i++)
			{
				num[i] = 1;
			}
			k = 1;
			i = 1;
			while (cnt > 1)
			{
				if (i > n)
				{
					i = 1;
				}
				if (num[i] == 0)
				{
					i++;
				}
				else
				{
					if (k == m)
					{
						num[i] = 0;
						cnt--;
						k = 1;
						i++;
					}
					else
					{
						i++;
						k++;
					}
				}
			}
			for (i = 1; i <= n; i++)
			{
				if (num[i] != 0)
				{
					System.out.print(i);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

