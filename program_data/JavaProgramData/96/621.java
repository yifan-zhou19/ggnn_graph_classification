package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int[] ans = new int[100];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int t = a.charAt(0) - '0';
		int c = 0;
		int d = 0;
		for (int i = 1; a.charAt(i) != 0; i++)
		{
			ans[i] = (10 * t + (a.charAt(i) - '0')) / 13;
			t = (10 * t + a.charAt(i) - '0') % 13;
			c++;
		}
		if (ans[1] == 0 && ans[2] != 0)
		{
			for (int i = 2;i <= c; i++)
			{
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}
		else if (ans[1] == 0 && ans[2] == 0)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			for (int i = 1;i <= c; i++)
			{
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}

}

