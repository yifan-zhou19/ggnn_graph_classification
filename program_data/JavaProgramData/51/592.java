package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[600]);
		int n;
		char[][] ans = new char[100][10];
		int acnt = 0;
		int mx = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;s.charAt(i + n) != '\0';i++)
		{
			int cnt = 1;
			for (int j = i + 1;s.charAt(j + n - 1) != '\0';j++)
			{
				int k;
				for (k = 0;k < n;k++)
				{
					if (s.charAt(i + k) != s.charAt(j + k))
					{
						break;
					}
				}
				if (k == n)
				{
					cnt++;
				}
			}
			if (cnt > mx)
			{
				mx = cnt;
				acnt = 1;
				for (int j = 0;j < n;j++)
				{
					ans[acnt][j] = s.charAt(i + j);
				}
				ans[acnt][n] = '\0';
			}
			else if (cnt == mx)
			{
				acnt++;
				for (int j = 0;j < n;j++)
				{
					ans[acnt][j] = s.charAt(i + j);
				}
				ans[acnt][n] = '\0';
			}
		}
		if (mx != 1)
		{
			System.out.print(mx);
			System.out.print("\n");
			for (int i = 1;i <= acnt;i++)
			{
				System.out.print(ans[i]);
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("NO");
		}

	}

}

