package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30];
	public static int[] len = new int[30];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
		  a[n - i + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  len[i] = 1;
		}
		for (i = 2;i <= n;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (a[j] <= a[i] != 0 && (len[j] + 1> len[i]))
				{
					len[i] = len[j] + 1;
				}
			}
		}
		int maxx = 0;
		for (i = 1;i <= n;i++)
		{
			if (len[i] > maxx)
			{
				maxx = len[i];
			}
		}
		System.out.print(maxx);
		System.out.print("\n");
		return 0;
	}
}

