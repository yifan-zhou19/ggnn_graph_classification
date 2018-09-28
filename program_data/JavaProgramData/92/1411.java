package <missing>;

public class GlobalMembers
{
	public static int cmp1(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p3 = (int *)p1;
		int p3 = (int)p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p4 = (int *)p2;
		int p4 = (int)p2;
		return p3 - p4;
	}

	public static int cmp2(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p3 = (int *)p1;
		int p3 = (int)p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p4 = (int *)p2;
		int p4 = (int)p2;
		return p4 - p3;
	}

	public static int[] q = new int[1001];
	public static int[] t = new int[1001];

	public static int Main()
	{
		int n;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0; i < n; i++)
			{
				t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0; i < n; i++)
			{
				q[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			qsort(t, n, (Integer.SIZE / Byte.SIZE), cmp1);
			qsort(q, n, (Integer.SIZE / Byte.SIZE), cmp2);


			//for (int i = 0; i < n; i ++)
			//	cout << t[i] << ' ' << q[i] << endl;

			int result = 0;

			int tl;
			int tr;
			int ql;
			int qr;
			tl = ql = 0;
			tr = qr = n - 1;

			while (ql <= qr != 0 && tl <= tr)
			{
				//cout << ql << ' ' << qr << endl;
				//cout << tl << ' ' << tr << endl;
				if (q[ql] < t[tr])
				{
					result += 200;
					ql++;
					tr--;
					continue;
				}
				else
				{
					if (t[tl] > q[qr])
					{
						result += 200;
						tl++;
						qr--;
					}
					else
					{
						if (t[tl] < q[ql])
						{
							result -= 200;
							tl++;
							ql++;
						}
						else
						{
							tl++;
							ql++;
						}
					}
				}
			}
			System.out.print(result);
			System.out.print("\n");
		}

		return 0;
	}
}

