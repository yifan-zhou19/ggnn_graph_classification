package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[50];
		int n;
		int i;
		int j;
		int p;
		int q;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			p = 0;
			q = 1;
			if (s[i] == 1)
			{
			q = 1;
			}
			if (s[i] > 1)
			{
				for (j = 2;j <= s[i];j++)
				{
					a = p;
					p = q;
					q = q + a;
				}
			}
			System.out.print(q);
			System.out.print("\n");
		}

			return 0;
	}

}

