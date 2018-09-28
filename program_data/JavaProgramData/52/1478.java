package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n - 1;j++)
			{
				temp = a[n - 1];
				a[n - 1] = a[j];
				a[j] = temp;
			}
		}
		for (int i = 0;i < n;i++)
		{
				System.out.print(a[i]);
				if (i != n - 1)
				{
				System.out.print(" ");
				}
		}
	}

}

