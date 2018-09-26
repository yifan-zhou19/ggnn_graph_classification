package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int i;
		int j;
		int[] b = new int[500];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j = j + 1;
			}
		}
		n = j;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (b[j] > b[j + 1])
				{
					a[0] = b[j];
					b[j] = b[j + 1];
					b[j + 1] = a[0];
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			if (j == 0)
			{
				System.out.print(b[j]);
			}
			else
			{
				System.out.print(",");
				System.out.print(b[j]);
			}
		}
		return 0;
	}


}

