package <missing>;

public class GlobalMembers
{
	public static int cmp(Object e1, Object e2)
	{
		return *(int)e1 - (int)e2;
	}
	public static int Main()
	{
		int[] tian = new int[1000];
		int[] qi = new int[1000];
		int i;
		int n;
		int tf;
		int tl;
		int qf;
		int ql;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			for (i = 0 ;i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tian[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0 ;i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qi[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(tian, n, (Integer.SIZE / Byte.SIZE), cmp);
			qsort(qi, n, (Integer.SIZE / Byte.SIZE), cmp);

			tf = 0;
			qf = 0;
			tl = n - 1;
			ql = n - 1;
			count = 0;
			while (n-- != 0)
			{
				if (tian[tf] > qi[qf])
				{ //???
					count++;
					tf++;
					qf++;
				}
				else if (tian[tf] < qi[qf])
				{
					tf++;
					ql--;
					count--;
				}
				else
				{ //  ????
					if (tian[tl] > qi[ql])
					{
						tl--;
						ql--;
						count++;
					}
					else if (tian[tl] < qi[ql])
					{
						count--;
						tf++;
						ql--;
					}
					else
					{ //  ????
						if (tian[tf] < qi[ql])
						{
							count--;
						}
						//else if ==
						tf++;
						ql--;
					}

				}

			}
			System.out.printf("%d\n", count * 200);
			// next
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		}
		return 0;
	}
}

