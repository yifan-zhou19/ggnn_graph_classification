package <missing>;

public class GlobalMembers
{
	public static int[] Tian = new int[MAXIN];
	public static int[] Qi = new int[MAXIN];
	public static int N;

	public static int MyCompare(Object e1, Object e2)
	{
		return *(int) e2 - (int) e1;
	}

	public static int Main()
	{
		while (scanf("%d", N) && N != 0)
		{
			int i;
			for (i = 0;i < N;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					Tian[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < N;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					Qi[i] = Integer.parseInt(tempVar2);
				}
			}

			qsort(Tian, N, (Integer.SIZE / Byte.SIZE), MyCompare);
			qsort(Qi, N, (Integer.SIZE / Byte.SIZE), MyCompare);

			int Tp = 0;
			int Qp = 0;
			int ans;
			while (Tian[0] < Qi[Qp] && Qp < N)
			{
				Qp++;
			}

			for (ans = -200 * N; Qp < N; Qp++)
			{
				int temp = -200 * Qp;
				for (int j = Qp, Tp = 0; j < N; j++, Tp++)
				{
					if (Tian[Tp] > Qi[j])
					{
						temp += 200;
					}
					else if (Tian[Tp] < Qi[j])
					{
						temp -= 200;
					}
				}

				if (temp > ans)
				{
					ans = temp;
				}
			}

			System.out.printf("%d\n", ans);
		}
		return 0;
	}
}

