package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int s = 0;
		int i;
		int d = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				s = s + 1;
				c[i] = s;
			}
			else
			{
				s = 0;
				c[i] = 0;
			}
			if (d <= c[i])
			{
				d = c[i];
			}
		}
		System.out.print(d);
		System.out.print("\n");
	return 0;
	}
}

