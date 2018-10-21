package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] tj = new int[1005];
		int[] qw = new int[1005];
		int win;
		int tl;
		int tr;
		int ql;
		int qr;
		while ((n != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (i = 0;i < n;i++)
			{
				tj[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < n;i++)
			{
				qw[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tj,tj + n);
			sort(qw,qw + n);
			win = 0;
			tl = ql = 0;
			tr = qr = n - 1;
			for (i = 0;i < n;i++)
			{
				if (qw[ql] < tj[tl])
				{
					win++;
					ql++;
					tl++;
				}
				else if (qw[ql] > tj[tl])
				{
					win--;
					qr--;
					tl++;
				}
				else
				{
					if (qw[qr] < tj[tr])
					{
						win++;
						qr--;
						tr--;
					}
					else if (qw[qr] > tj[tr])
					{
						win--;
						qr--;
						tl++;
					}
					else
					{
						if (qw[qr] > tj[tl])
						{
							win--;
						}
						qr--;
						tl++;

					}
				}
			}
			System.out.print(200 * win);
			System.out.print("\n");
		}
		return 0;
	}



}

