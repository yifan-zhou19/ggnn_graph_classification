package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000]; //a??????????????
		int[] b = new int[10000];
		int n;
		int i;
		int j;
		int k;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = 0;
		while (n != 0)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			a[i]++;
			b[j]++;
		}
		for (k = 0;k <= n - 1;k++)
		{
			if (b[k] == n - 1 && a[k] == 0)
			{
				System.out.print(k);
				q = 1;
			}
		}
		if (q == 0)
		{
			System.out.print("NOT FOUND");
		}
			return 0;
	}











}

