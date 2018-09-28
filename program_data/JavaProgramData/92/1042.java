package <missing>;

public class GlobalMembers
{
	public static final int N = 1001;
	public static int n;
	public static int[] tj = new int[N];
	public static int[] qw = new int[N];
	public static int x;
	public static int y;
	public static int a;
	public static int b;
	public static int ans;
	public static void fight(int s, int t)
	{
		if (tj[s] < qw[t])
		{
			ans--;
		}
		else if (tj[s] > qw[t])
		{
			ans++;
		}
	}
	public static int Main()
	{
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0; i < n; i++)
			{
				tj[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				qw[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tj,tj + n);
			sort(qw,qw + n);

			x = a = 0;
			y = b = n - 1;
			ans = 0;

			for (int i = 0; i < n ; i++)
			{
				if (qw[y] < tj[b])
				{
					fight(b--, y--);
				}
				else if (qw[y] > tj[b])
				{
					fight(a++, y--);
				}
				else
				{
					if (qw[x] >= tj[a])
					{
						fight(a++, y--);
					}
					else if (qw[x] < tj[a])
					{
						fight(a++, x++);
					}
				}
			}
			System.out.print(ans * 200);
			System.out.print("\n");
		}
	}

}

