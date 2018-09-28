package <missing>;

public class GlobalMembers
{
	public static int comp1(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
	public static int comp2(Object a, Object b)
	{
		return -(int)b + (int)a;
	}

	public static int Main()
	{
		int a;
		int[] t = new int[1002];
		int[] q = new int[1002];
		int i;
		int j;
		int win = 0;
		int ping = 0;
		int x = 0;
		a = 1;
		while (true)
		{
			int[] t2 = new int[1002];
			int[] q2 = new int[1002];
			win = 0;
			ping = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
					  if (a == 0)
					  {
						  break;
					  }
			for (i = 1;i <= a;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 1;i <= a;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q[i] = Integer.parseInt(tempVar3);
				}
			}
			qsort(t + 1,a,(Integer.SIZE / Byte.SIZE),comp2);
			qsort(q + 1,a,(Integer.SIZE / Byte.SIZE),comp2);
			for (i = 1;i <= a;i++)
			{
				for (j = a;j != 0;j--)
				{
					if (t2[i] == 0 && q2[j] == 0)
					{
					if (t[i] > q[j])
					{
						t2[i] = 1;
						q2[j] = 1;
						win = win + 1;
						break;
					}
					}
				}
			}
			for (i = 1;i <= a;i++)
			{
				if (t2[i] == 0)
				{
				for (j = 1;j <= a;j++)
				{
					if (q2[j] == 0)
					{
						if (t[i] == q[j])
						{
							ping = ping + 1;
							break;
						}
					}
				}
				}
			}
			System.out.printf("%d\n",400 * win - 200 * a + 200 * ping);
		}
		return 0;
	}
}

