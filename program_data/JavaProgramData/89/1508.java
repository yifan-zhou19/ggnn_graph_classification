package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] know = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			know[i] = 0;
		}
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == j && i == 0)
			{
				break;
			}
			know[i] = -1;
			if (know[j] != -1)
			{
				know[j]++;
				if (know[j] == n - 1)
				{
					System.out.print(j);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

