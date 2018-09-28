package <missing>;

public class GlobalMembers
{
	public static int[] tian = new int[1000];
	public static int[] qiw = new int[1000];
	public static int n;
	public static int Main()
	{
		while ((n != 0 && n = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			for (int i = 0;i < n;i++)
			{
				tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
				qiw[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			sort(tian,tian + n);
			sort(qiw, qiw + n);
			int ti;
			int tj;
			int qi;
			int qj;
			ti = qi = 0;
			tj = qj = n - 1;
			int sum = 0;
			for (int i = 0;i < n;i++)
			{
				if (tian[ti] < qiw[qi])
				{
					sum -= 200;
					ti++;
					qj--;
				}
				else if (tian[ti] > qiw[qi])
				{
					sum += 200;
					ti++;
					qi++;
				}
				else if (tian[tj] < qiw[qj])
				{
					sum -= 200;
					ti++;
					qj--;
				}
				else if (tian[tj] > qiw[qj])
				{
					sum += 200;
					tj--;
					qj--;
				}
				else
				{
					if (tian[ti] > qiw[qj])
					{
						sum += 200;
					}
					else if (tian[ti] < qiw[qj])
					{
						sum -= 200;
					}
					ti++;
					qj--;
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

