package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[500];
		int i;
		int j;
		int n;
		int a;
		int temp;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a % 2 == 1)
			{
				 m = m + 1;
				 num[m] = a;
			}
		}
		for (i = 1; i < m; i++)
		{
			for (j = i + 1; j <= m; j++)
			{
				if (num[i] > num[j])
				{
					 temp = num[i];
					 num[i] = num[j];
					 num[j] = temp;
				}
			}
		}
		System.out.print(num[1]);
		for (i = 2; i <= m; i++)
		{
			System.out.print(",");
			System.out.print(num[i]);
		}
		return 0;
	}

}

