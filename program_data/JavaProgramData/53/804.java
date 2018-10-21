package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int n;
		int i;
		int j;
		int p;
		int[] del = new int[301];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (a[i] == a[j])
				{
					del[i] = 1;
					break;
				}
			}
			if (del[i] == 0)
			{
				System.out.print(',');
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

