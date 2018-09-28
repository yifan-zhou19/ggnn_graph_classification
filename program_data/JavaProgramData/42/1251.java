package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = -1;
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int count = 0;
		for (i = 0;i < n - count;i++)
		{
			while (a[i] == k && i != n - count - 1)
			{
				for (j = i;j < n - 1;j++)
				{
					a[j] = a[j + 1];
				}
				count++;
			}
			if (a[i] == k && i == n - count - 1)
			{
				count++;
			}
		}
		for (i = 0;i < n - count - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - count - 1]);
		System.out.print("\n");
		return 0;
	}


}

