package <missing>;

public class GlobalMembers
{
	///#define N 5
	public static void chan(tangible.RefObject<Integer> p, tangible.RefObject<Integer> q)
	{
		int t = p.argValue;
		p.argValue = q.argValue;
		q.argValue = t;
	}


	public static int exch(int[][] ar, int n, int m)
	{
		if (n >= 5 || m >= 5)
		{
			return 0;
		}
		else
		{
			int i;
			for (i = 0; i < 5; i++)
			{
				chan(*(ar + n) + i, *(ar + m) + i);
			}
			return 1;
		}
	}

	public static int Main()
	{
		int[][] ar = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int k;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(ar + i) + j = tempVar;
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		k = exch(ar, n, m);
		if (k == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0; i < 5; i++)
			{
			for (j = 0; j < 5; j++)
			{
				if (j == 4)
				{
					System.out.printf("%d\n", *(*(ar + i) + j));
				}
				else
				{
					System.out.printf("%d ", *(*(ar + i) + j));
				}
			}
			}
		}
		return 0;
	}
}

