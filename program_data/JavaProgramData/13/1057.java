package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int[] b = new int[100001];
		int i;
		int j;
		int step = 1;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b[step] = a[1];
		System.out.print(a[1]);
		for (i = 2; i <= n ; i++)
		{
			for (j = 1; j <= step; j++)
			{
				if (a[i] == b[j])
				{
					break;
				}
			}
			if (j == step + 1)
			{
				step++;
				System.out.print(" ");
				System.out.print(a[i]);
				b[step] = a[i];
			}
		}
		return 0;
	}

}

