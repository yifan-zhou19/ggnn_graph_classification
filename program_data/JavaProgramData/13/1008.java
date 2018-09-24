package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int[] b = new int[20000];
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				if (b[j] == 0)
				{
					if (a[i] == a[j])
					{
					   b[j] = 1;
					   k++;
					}
				}
			}
		}
		System.out.print(a[0]);
		for (i = 1; i < n; i++)
		{
			if (b[i] == 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;
	}


}

