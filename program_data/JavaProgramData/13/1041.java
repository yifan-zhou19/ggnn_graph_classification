package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[200001];
		int[] k = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k[s[i]]++;
		}
		int[] flag = new int[100];
		for (int i = 0; i < n; i++)
		{
			if (k[s[i]] == 1 && flag[s[i]] == 0)
			{
				if (i == 0)
				{
					System.out.print(s[i]);
				}
				if (i != 0)
				{
					System.out.print(" ");
					System.out.print(s[i]);
				}
			}
			if (k[s[i]] != 1 && flag[s[i]] == 0)
			{
				if (i == 0)
				{
					System.out.print(s[i]);
				}
				if (i != 0)
				{
					System.out.print(" ");
					System.out.print(s[i]);
				}
				flag[s[i]] = 1;
			}
		}
		return 0;
	}

}

