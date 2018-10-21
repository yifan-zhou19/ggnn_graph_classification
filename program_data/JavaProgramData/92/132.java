package <missing>;

public class GlobalMembers
{
	public static int Compare(Object e1, Object e2)
	{
		return *(int)e1 - (int)e2;
	}
	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			else
			{
				int[] qi = new int[1100];
				int[] tian = new int[1100];
				 int qhead = 1;
				 int qtail = n;
				 int thead = 1;
				 int ttail = n;
				 int i;
				 int num = 0;
				for (i = 1;i <= n;i++)
				{
					tian[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 1;i <= n;i++)
				{
					qi[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				qsort(tian + 1,n,(Integer.SIZE / Byte.SIZE),Compare);
				qsort(qi + 1,n,(Integer.SIZE / Byte.SIZE),Compare);
				while (thead <= ttail)
				{
					if (tian[thead] > qi[qhead])
					{
						num += 200;
						thead++;
						qhead++;
					}
					else if (tian[thead] < qi[qhead])
					{
						num -= 200;
						   thead++;
						   qtail--;
					}
					else
					{
						if (tian[ttail] > qi[qtail])
						{
							ttail--;
							qtail--;
							num += 200;
						}
						else if (tian[ttail] == qi[qtail])
						{
							if (tian[thead] == qi[qtail])
							{
								thead++;
								qtail--;
							}
							else if (tian[thead] < qi[qtail])
							{
								num -= 200;
								 thead++;
								qtail--;
							}
						}
						else
						{
								num -= 200;
								thead++;
								qtail--;

						}
					}
				}
				System.out.print(num);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

