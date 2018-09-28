package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s = 0;
		int[] a = new int[101];
		int[] b = new int[101];
		int[] c = new int[101];
		int[] d = new int[101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
						if (c[i - 1] == 0)
						{
							s++;
						}
			c[i] = s;
			}
		}
		int sum = 0;
		for (i = 1;i <= n;i++)
		{
		d[c[i]]++;
		}
		for (i = 1;i <= n;i++)
		{
		if (d[i] > sum)
		{
			sum = d[i];
		}
		}
		System.out.print(sum);
		return 0;
	}

}

