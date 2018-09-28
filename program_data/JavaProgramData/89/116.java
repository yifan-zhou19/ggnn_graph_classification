package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = b[i] = 0;
		}
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			b[i] = 1;
			a[j]++;
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 0 && a[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}


}

