package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)b - (int)a;
	}

	public static int Main()
	{
		int i;
		int n;
		int[] t = new int[1005];
		int[] w = new int[1005];
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (i = 0 ; i < n; i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0 ; i < n; i++)
			{
				w[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(t,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(w,n,(Integer.SIZE / Byte.SIZE),cmp);
			int count = 0;
			int thead = 0;
			int khead = 0;
			int ttail = n - 1;
			int ktail = n - 1;
			while (thead <= ttail)
			{
				if (t[thead] > w[khead]) //????>????????
				{
					count++;
					thead++;
					khead++;
				}
				else if (t[thead] < w[khead]) //????<??????????????
				{
					ttail--;
					count--;
					khead++;
				}
				else //??
				{
					while (ttail >= thead)
					{
						if (t[ttail] > w[ktail]) //???????????
						{
							count++;
							ttail--;
							ktail--;
						}
						else
						{
							if (t[ttail] < w[khead])
							{
								count--;
							}
							ttail--;
							khead++;
							break;
						}
					}
				}
			}
			System.out.print(count * 200);
			System.out.print("\n");
		}
		return 0;
	}

}

