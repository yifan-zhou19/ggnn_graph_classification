package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 1 || a[i] == 2)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				for (j = 3; j <= a[i]; j++)
				{
					b[j] = b[j - 1] + b[j - 2];
				}
				System.out.print(b[j - 1]);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

