package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = -1;
		int[] a = new int[10000];
		int[] b = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			a[i]++;
			b[j]++;
		}
		for (i = 0 ; i < n ; i++)
		{
			if (a[i] == 0 && b[i] == n - 1)
			{
				if (m == -1)
				{
					m = i;
				}
				else
				{
					m = -1;
					break;
				}
			}
		}
		if (m == -1)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		else
		{
			System.out.print(m);
			System.out.print("\n");
		}
	}
}

