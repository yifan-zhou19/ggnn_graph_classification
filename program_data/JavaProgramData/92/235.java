package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] q = new int[1001];
	public static int[] t = new int[1001];
	public static int qshang;
	public static int tshang;
	public static int qxia;
	public static int txia;

	public static int cmp(Object a, Object b)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1=(int*)a;
		int p1 = (int)a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2=(int*)b;
		int p2 = (int)b;
		return p2 - p1;
	}

	public static int Main()
	{
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			int i;
			for (i = 1;i <= n;i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 1;i <= n;i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(q + 1,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(t + 1,n,(Integer.SIZE / Byte.SIZE),cmp);

			int res = 0;
			qxia = txia = n;
			qshang = tshang = 1;
			while (qshang <= qxia != 0 && tshang <= txia)
			{
				if (t[txia] > q[qxia])
				{
					res++;
					qxia--;
					txia--;
				}
				else if (t[txia] < q[qxia])
				{
					txia--;
					qshang++;
					res--;
				}
				else
				{
					if (q[qshang] > t[tshang])
					{
						qshang++;
						txia--;
						res--;
					}
					else if (q[qshang] < t[tshang])
					{
						tshang++;
						qshang++;
						res++;
					}
					else
					{
						if (t[txia] < q[qshang])
						{
							txia--;
							qshang++;
							res--;
						}
						else
						{
							txia--;
							qshang++;
						}
					}
				}
			}
			System.out.print(res * 200);
			System.out.print("\n");
		}
		return 0;
	}
}

