package <missing>;

public class GlobalMembers
{
	public static final int MaxSize = 1010;
	public static int[] t = new int[MaxSize];
	public static int[] q = new int[MaxSize];

	public static int Main()
	{
		int N;
		while ((N != 0 && N != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (int i = 0; i < N; i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < N; i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			sort(t, t + N);
			sort(q, q + N);

			int ans = 0;
			int tSt = 0;
			int tEnd = N - 1;
			int qSt = 0;
			int qEnd = N - 1;

			while (tSt <= tEnd)
			{
				if (t[tEnd] > q[qEnd])
				{
					ans += 200;
					tEnd--;
					qEnd--;
				}
				else if (t[tSt] > q[qSt])
				{
					ans += 200;
					tSt++;
					qSt++;
				}
				else
				{
					if (t[tSt] < q[qEnd])
					{
						ans -= 200;
					}
					tSt++;
					qEnd--;
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}

		return 0;
	}


}

