package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*    ??   1100012931                                 *
	//*    ??   ???????????                     *
	//*    ???  2011.10.16                                *
	//********************************************************
	public static int Main()
	{
		int n;
		int m;
		int t;
		int d;
		int k;
		int all = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;m <= n;m++)
		{
			if (m % 7 == 0)
			{
				continue; //*??????
			}
			t = 0;
			d = m; //*????t?d????????????
			do
			{
				k = d % 10;
				if (k == 7)
				{
					t++;
					break;
				} //*break?????????
				d = d / 10;
			}while (d > 1);
			if (t == 0)
			{
				all += m * m;
			}
		}
		System.out.print(all);
		System.out.print("\n");
		return 0;
	}
}

