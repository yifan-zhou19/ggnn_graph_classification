package <missing>;

public class GlobalMembers
{
	public static int mycmp(Object e1, Object e2)
	{
		return *((int)e1) - (int)e2;
	}

	public static int Main()
	{
		int[] tj = new int[1002];
		int[] qw = new int[2002];
		int[] q;
		int n;
		int ans;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			ans = -99999;
			for (int i = 0; i < n; i++)
			{
				tj[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				qw[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(tj, n, (Integer.SIZE / Byte.SIZE), mycmp);
			qsort(qw, n, (Integer.SIZE / Byte.SIZE), mycmp);
			for (int i = 0; i < n; i++)
			{
				qw[i + n] = qw[i];
			}
			for (q = qw; q < qw + n; q++)
			{
				int tmp = 0;
				for (int i = 0; i < n; i++)
				{
					if (tj[i] > q[i])
					{
						tmp++;
					}
					else if (tj[i] < q[i])
					{
						tmp--;
					}
				}
	//			cout << qw[0] << "|" << qw[1] << endl;
	//			cout << tmp << endl;
				if (tmp > ans)
				{
					ans = tmp;
				}
			}
			System.out.print(200 * ans);
			System.out.print("\n");
		}
		return 0;
	}

}

