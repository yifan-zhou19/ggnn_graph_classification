package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int j;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n - 1;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
				if (a[i] % 2 == 1)
				{
					j = j + 1;
					if (j == 1)
					{
					System.out.print(a[i]);
					}
					else
					{
					System.out.print(",");
					System.out.print(a[i]);
					}
				}
		}
		return 0;
	}
}

