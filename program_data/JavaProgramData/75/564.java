package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int s = 0;
		int max = 0;
		int t = 0;
		int[] a = new int[1020];
		int[] b = new int[1020];
		int[] d = new int[1000];
		char c;
		for (i = 1;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (c != ',')
			{
				break;
			}
		}
		for (j = 1;j <= i;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			if (b[j] > t)
			{
				t = b[j];
			}
		}
		for (j = 1;j <= i;j++)
		{
			for (k = a[j];k < b[j];d[k]++,k++)
			{
				;
			}
		}
		for (j = 0;j <= t;j++)
		{
			if (d[j] > max)
			{
				max = d[j];
			}
		}
		System.out.print(i);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

