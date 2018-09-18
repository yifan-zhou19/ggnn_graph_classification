package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] mark = new int[101];
		for (int i = 0; i < 101; i++)
		{
			mark[i] = 0;
		}
		int[] num = new int[20005];
		for (int i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(num[0]);
		mark[num[0]] = 1;
		for (int i = 0; i < n; i++)
		{
			if (mark[num[i]] == 0)
			{
				mark[num[i]] = 1;
				System.out.print(" ");
				System.out.print(num[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

