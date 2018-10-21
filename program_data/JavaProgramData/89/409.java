package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] p1 = new int[10000];
		int[] p2 = new int[10000];
		int k;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			p1[k] = p2[k] = 0;
		}
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			p1[i]++;
			p2[j]++;
		}
		for (k = 0;k < n;k++)
		{
			if (p2[k] == n - 1 && p1[k] == 0)
			{
				System.out.print(k);
				break;
			}
		}
		if (k == n)
		{
		System.out.print("NOT FOUND");
		}
		return 0;

	}
}

