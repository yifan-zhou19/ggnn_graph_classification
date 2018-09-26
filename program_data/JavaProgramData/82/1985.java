package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int m = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i = j + 1)
		{
			for (j = i, m = 0;j < n && b[j] >= 90 && b[j] <= 140 && c[j] >= 60 && c[j] <= 90;j++, m++)
			{
				;
			}
		a[k++] = m;
		}
		for (i = 0;i < k;i++)
		{
			if (a[i] >= max)
			{
			   max = a[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

