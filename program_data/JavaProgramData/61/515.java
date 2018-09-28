package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] F = new int[25];
		int i;
		for (i = 1;i <= 20;i++)
		{
			if (i == 1 || i == 2)
			{
				F[i] = 1;
			}
			else
			{
				F[i] = F[i - 1] + F[i - 2];
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			n--;
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(F[a]);
			System.out.print("\n");
		}
		return 0;
	}
}

