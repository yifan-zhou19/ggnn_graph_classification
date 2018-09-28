package <missing>;

public class GlobalMembers
{
	public static int ans = 0;
	public static int n;
	public static int[] horses1 = new int[1001];
	public static int[] horses2 = new int[1001];
	public static void cal()
	{
		int pos;
		if (horses1[n - 1] == -1)
		{
			return;
		}
		for (int i = 0 ; i < n ; i++)
		{
			if (horses1[i] != -1)
			{
				pos = i;
				break;
			}
		}
		if (horses1[pos] > horses2[pos])
		{
			ans += 200;
			horses1[pos] = -1;
			horses2[pos] = -1;
			cal();
			return;
		}
		if (horses1[pos] < horses2[pos])
		{
			ans -= 200;
			horses1[pos] = -1;
			for (int i = n - 1 ; i >= 1 ; i--)
			{
				horses2[i] = horses2[i - 1];
			}
			horses2[0] = -1;
			cal();
			return;
		}
		if (horses1[n - 1] > horses2[n - 1])
		{
			ans += 200;
			for (int i = n - 1 ; i >= 1 ; i--)
			{
				horses1[i] = horses1[i - 1];
			}
			horses1[0] = -1;
			for (int i = n - 1 ; i >= 1 ; i--)
			{
				horses2[i] = horses2[i - 1];
			}
			horses2[0] = -1;
			cal();
			return;
		}
		if (horses1[n - 1] < horses2[n - 1])
		{
			ans -= 200;
			horses1[pos] = -1;
			for (int i = n - 1 ; i >= 1 ; i--)
			{
				horses2[i] = horses2[i - 1];
			}
			horses2[0] = -1;
			cal();
			return;
		}
		if (horses1[n - 1] == horses2[n - 1])
		{
			if (horses1[pos] < horses2[n - 1])
			{
				ans -= 200;
			}
			horses1[pos] = -1;
			for (int i = n - 1 ; i >= 1 ; i--)
			{
				horses2[i] = horses2[i - 1];
			}
			horses2[0] = -1;
			cal();
			return;
		}
	}
	public static int Main()
	{
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (int i = 0 ; i < n ; i++)
			{
				horses1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0 ; i < n ; i++)
			{
				horses2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(horses1, horses1 + n);
			sort(horses2, horses2 + n);
			cal();
			System.out.print(ans);
			System.out.print("\n");
			ans = 0;
			/*
			for (int i = 0 ; i < n ; i ++)
				cout << horses1[i] << ' ';
			cout << endl;
			for (int i = 0 ; i < n ; i ++)
				cout << horses2[i] << ' ';
			cout << endl;
			*/
		}
		return 0;
	}
}

