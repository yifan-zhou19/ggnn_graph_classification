package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int i;
		int j;
		int sum;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = n;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			if (a[i] == 0)
			{
				continue;
			}
			for (j = i + 1; j < n; j++)
			{
				if (a[j] == a[i])
				{
					a[j] = 0;
					sum--;
				}
			}
		}
		j = 0;
		for (i = 0; i < n; i++)
		{
			if (a[i] == 0)
			{
				continue;
			}
			System.out.print(a[i]);
			j++;
			if (j != sum)
			{
				System.out.print(' ');
			}
		}
		return 0;
	}
}

