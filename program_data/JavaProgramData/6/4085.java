package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int i;
		int l;
		int n;
		int[] sum = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (l = 0;l < a[i] * b[i];l++)
			{
				c[l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (l <= b[i] != 0 || l >= (b[i] * a[i] - b[i] + 1) || l % b[i] == 0 || (l + 1) % b[i] == 0)
				{
					sum[i] += c[l];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(sum[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

