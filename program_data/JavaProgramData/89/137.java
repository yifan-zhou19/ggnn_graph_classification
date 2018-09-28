package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] relation = new int[10000];
		int i;
		int ans = -1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a == 0 && b == 0)
			{
				break;
			}
			relation[a]++;
			relation[b]++;
		}
		for (i = 0;i < n;i++)
		{
			if (relation[i] == n - 1)
			{
				ans = i;
			}
		}
		if (ans == -1)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		else
		{
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

