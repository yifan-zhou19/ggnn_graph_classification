package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int temp;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = n - m;i >= 1;i--)
		{
			for (j = 0;j < m;j++)
			{
				temp = (a + i + j);
				a[i + j] = (a + i + j + 1);
				a[i + j + 1] = temp;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (i < n)
			{
			System.out.print(a[i]);
			System.out.print(" ");
			}
			else
			{
			System.out.print(a[i]);
			System.out.print("\n");
			}
		}
		return 0;
	}
}

