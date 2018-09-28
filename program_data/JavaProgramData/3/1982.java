package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int[] a = new int[1000];
		int i = 0;
		int j = 0;
		int m;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				m = a[i] + a[j];
				if (m == k)
				{
				  t = 1;
				}
			}
		}
		if (t == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

