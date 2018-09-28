package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static int Main()
	{
		int N;
		int[] inA = new int[MAXN];
		int[] oddA = new int[MAXN];
		int M = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
			inA[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < N;i++)
		{
			if (inA[i] % 2 != 0)
			{
				 oddA[M] = inA[i];
				M++;
			}
		}
		qsort(oddA,M,(Integer.SIZE / Byte.SIZE),cmp);
		for (int i = 0;i < M;i++)
		{
			System.out.print(oddA[i]);
			if (i != M - 1)
			{
				System.out.print(',');
			}
		}
		return 0;
	}
}

