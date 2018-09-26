package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		int[] f = new int[300];
		int[] a = new int[100];
		f[1] = 0;
			while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				if (n == 0 && m == 0)
				{
					break;
				}
				j++;
				for (i = 2;i <= n;i++)
				{
					f[i] = (f[i - 1] + m) % i;
				}
				a[j] = f[n] + 1;

			}
			for (i = 1;i <= j;i++)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		return 0;
	}
}

