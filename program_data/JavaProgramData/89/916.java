package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int b;
		int c;
		int n;
		int[] d = new int[100000];
		int f = 0;
		int[] p = a;
		int[] q = d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if ((b == 0) && (c == 0))
			{
				break;
			}
			(p[b])++;
			(q[c])++;
		}
		for (i = 0; i <= n - 1; i++)
		{
			if ((a[i] == 0) && (d[i] == n - 1))
			{
				f = 1;
				System.out.print(i);
			}
		}
		if (f == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}
}

