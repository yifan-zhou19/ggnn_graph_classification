package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int n;
		int m;
		int k;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < n;m++)
		{
		a[m] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
					return 0;
				}
			}
		}
		System.out.print("no");
		return 0;
	}

}

