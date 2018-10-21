package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int step = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			if (a[i] == k)
			{
			step++;
			}
			else
			{
			a[i - step] = a[i];
			}
		}
		for (i = 0; i <= n - 1 - step; i++)
		{
			if (i == 0)
			{
			System.out.print(a[0]);
			}
			else
			{
			System.out.print(" ");
			System.out.print(a[i]);
			}
		}
	}

}

