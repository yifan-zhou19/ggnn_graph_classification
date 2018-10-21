package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 0;
		int num = 0;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] sum1 = new int[10000];
		int[] sum2 = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num++;
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
		}
		for (j = 0; j < n; j++)
		{
			for (i = 0; i < num - 1; i++)
			{
				if (a[i] == j)
				{
					sum1[j]++;
				}
				if (b[i] == j)
				{
					sum2[j]++;
				}
			}
		}
		for (j = 0; j < n; j++)
		{
			if (sum1[j] == 0 && sum2[j] == n - 1)
			{
				System.out.print(j);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

