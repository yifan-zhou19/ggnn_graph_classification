package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		int count1 = 0;
		int i = -1;
		int j = 0;
		int[] a = new int[1000000];
		int[] b = new int[1000000];
		int[] x = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			i++;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count++;
		}while (a[i] != 0 || b[i] != 0);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < count;j++)
			{
				if (b[j] == i && (a[j] != 0 || b[j] != 0))
				{
					x[i]++;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i] >= n - 1)
			{
				System.out.print(i);
				count1++;
			}
		}
		if (count1 == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

