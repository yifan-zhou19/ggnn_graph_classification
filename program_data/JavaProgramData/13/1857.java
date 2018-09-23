package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[20001];
		int x;
		int i;
		int j;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x; i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1; i <= x; i++)
		{
			for (j = 1; j <= x; j++)
			{
				if (n [i] == n[j] && j > i)
				{
					n [j] = 0;
				}
			}
		}
		System.out.print(n[1]);
		for (i = 2; i <= x; i++)
		{
			if (n[i] != 0)
			{
				System.out.print(" ");
				System.out.print(n[i]);
			}
		}
		return 0;
	}

}

