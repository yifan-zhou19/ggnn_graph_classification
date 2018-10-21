package <missing>;

public class GlobalMembers
{
	public static int cmp(Object p1, Object p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *e1,*e2;
		int e1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *e2;
		int e2;
		e1 = (int)p1;
		e2 = (int)p2;
		return e1 > e2 != 0?1:-1;
	}
	public static int Main()
	{
		int n;
		int[] T = new int[1001];
		int[] E = new int[1001];
		while (true)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				break;
			}
			for (int i = 0;i < n;i++)
			{
			T[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < n;i++)
			{
			E[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			qsort(T,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(E,n,(Integer.SIZE / Byte.SIZE),cmp);
			int ans = 0;
			int lT = 0;
			int lE = 0;
			int rT = n - 1;
			int rE = n - 1;
			while (lT <= rT)
			{
				if (T[lT] > E[lE])
				{
					ans += 200;
					lT++;
					lE++;
				}
				else if (T[lT] < E[lE])
				{
					ans -= 200;
					lT++;
					rE--;
				}
				else
				{
					if (T[rT] < E[rE])
					{
						ans -= 200;
						lT++;
						rE--;
					}
					else if (T[rT] > E[rE])
					{
						ans += 200;
						rE--;
						rT--;
					}
					else
					{
						if (T[lT] < E[rE])
						{
							ans -= 200;
							lT++;
							rE--;
						}
						else
						{
							lT++;
							rE--;
						}
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}

		return 0;
	}

}

