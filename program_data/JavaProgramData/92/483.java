package <missing>;

public class GlobalMembers
{
	public static int[] T = new int[1010];
	public static int[] Q = new int[1010];
	public static int Main()
	{
		int n;
		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int ret = 0;
			for (int i = 0; i < n; i++)
			{
				T[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				Q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(T, T + n);
			sort(Q, Q + n);
			int T_begin = 0;
			int Q_begin = 0;
			int T_end = n - 1;
			int Q_end = n - 1;
			while (T_begin <= T_end != 0 && Q_begin <= Q_end)
			{
				if (T[T_end] > Q[Q_end])
				{
					T_end--;
					Q_end--;
					ret++;
				}
				else if (T[T_begin] > Q[Q_begin])
				{
					T_begin++;
					Q_begin++;
					ret++;
				}
				else
				{
					if (T[T_begin] < Q[Q_end])
					{
						ret--;
					}
					T_begin++;
					Q_end--;
				}

			}
			System.out.print(ret * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

