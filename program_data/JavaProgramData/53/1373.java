package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[300];
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		while (i < n)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}
		int p;
		int j;
		int k;
		for (i = 0 ;i < n ;i++)
		{
			p = num[i];
			j = i + 1;
			while (j < n)
			{
				if (num[j] == p) //???????
				{
					k = j;
					while (k <= n - 2)
					{
						num[k] = num[k + 1];
						k++;
					}
					n--;
				}
				else
				{
					j++;
				}
			}
		}
		for (j = 0 ;j < n ; j++)
		{
			if (j == n - 1)
			{
				System.out.print(num[j]);
			}
			else
			{
				System.out.print(num[j]);
				System.out.print(",");
			}
		}

	}
}

