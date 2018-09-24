package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20005];
		int[] b = new int[20005];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; b[j] != 0; j++)
			{
				if (b[j] == a[i])
				{
					break;
				}
			}
			if (b[j] == 0)
			{
				b[j] = a[i];
			}
		}
		System.out.print(b[0]);
		for (i = 1; b[i] != 0; i++)
		{
			System.out.print(" ");
			System.out.print(b[i]);
		}

		return 0;
	}
}

