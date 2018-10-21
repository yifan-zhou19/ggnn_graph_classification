package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int g = 0;
		int[] a = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				a[j]++;
			}
		}
		for (k = 0;k < n;k++)
		{
			if (a[k] == n - 1)
			{
				System.out.print(k);
				System.out.print("\n");
				g = 1;
			}
		}
		if (g == 0)
		{
			System.out.print("NOT FOUND");
		}
		return 0;
	}


}

