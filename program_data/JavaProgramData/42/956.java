package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100000];
	public static int i;
	public static int n;
	public static int num;
	public static int m;
	public static int l;
	public static int k;

	public static int Main()
	{
		int count;
		count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 0; l < n; l++)
		{
			if (a[l] == num)
			{
				for (m = l; m < n; m++)
				{
					a[m] = a[m + 1];
				}
				l = l - 1;
				count++;
			}
		}
		for (k = 0;k < n - count;k++)
		{
			if (k == n - count - 1)
			{
				System.out.print(a[k]);
				break;
			}
			System.out.print(a[k]);
			System.out.print(" ");
		}
		return 0;

	}
}

