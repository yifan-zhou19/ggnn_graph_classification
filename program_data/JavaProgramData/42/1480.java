package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int i = 0;
		int j = 0;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0, j = 0; j < n; j++)
		{
			if (a[j] != k)
			{
				a[i++] = a[j];
			}
			else
			{
				s++;
			}
		}
		for (j = 0; j < n - s - 1; j++)
		{
		System.out.print(a[j]);
		System.out.print(" ");
		}
		System.out.print(a[n - s - 1]);
		System.out.print("\n");
		return 0;
	}
}

