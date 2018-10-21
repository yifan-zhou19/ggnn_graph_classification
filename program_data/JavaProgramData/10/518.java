package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[30];
		int i;
		for (i = n - 1;i >= 0;i--)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		int[] b = new int[30];
		for (i = 0;i < 30;i++)
		{
			b[i] = 1;
		}
		for (i = 1;i < n;i++)
		{
			for (int j = 0;j < i;j++)
			{
				if (a[j] <= a[i] != 0 && b[i] < b[j] + 1)
				{

					b[i] = b[j] + 1;

				}
			}
		}
		int max = 1;
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");

		return 0;
	}
}

