package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int[] d = new int[1000];
		int[] e = new int[1000];
		int[] f = new int[1000];
		int[] s = new int[1000];
		int i;
		for (i = 0;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			e[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
			{
				break;
			}
			else
			{
				s[i] = 3600 * (d[i] + 12 - a[i]) + 60 * (e[i] - b[i]) + f[i] - c[i];
			}
		}
		for (i = 0;;i++)
		{
			if (a[i] == 0 && b[i] == 0 && c[i] == 0 && d[i] == 0 && e[i] == 0 && f[i] == 0)
			{
				break;
			}
			else
			{
				System.out.print(s[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

