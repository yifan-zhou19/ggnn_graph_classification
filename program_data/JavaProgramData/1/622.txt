package <missing>;

public class GlobalMembers
{
	public static int fen(int a,int k)
	{
		int s = 0;
		int j;
		int t = 0;
		if (a == 1 && a >= k)
		{
			s = 1;
		}
		else if (a == k)
		{
			s = 1;
		}
		else
		{
			for (j = 2;j <= a;j++)
			{
				if (a % j == 0 && j >= k)
				{
				s = s + fen(a / j, j);
				}
				t = 1;
			}
			if (t == 0)
			{
			s++;
			}

		}
		return s;
	}
	public static int Main()
	{
		int n;
		int i;
		int q;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fen(a, 1));
			System.out.print("\n");
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

