package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		double max = Math.abs(a[0] * n - sum);
		for (i = 1;i < n;i++)
		{
			if (Math.abs(a[i] * n - sum) > max)
			{
				max = Math.abs(a[i] * n - sum); //????????????
			}
		}
		int[] save = new int[300];
		int count = 0;
		double e = 0.00001;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] * n - sum) == max)
			{
				save[count++] = i;
			}
		}
		int temp1;
		for (i = 0;i < count - 1;i++)
		{
			for (j = i + 1;j < count;j++)
			{
				if (a[save[i]] > a[save[j]])
				{
					temp1 = a[save[i]];
					a[save[i]] = a[save[j]];
					a[save[j]] = temp1;
				}
			}
		}
				for (i = 0;i < count;i++)
				{
					System.out.print(a[save[i]]);
					if (i != count - 1)
					{
						System.out.print(',');
					}
				}
		return 0;
	}
}

