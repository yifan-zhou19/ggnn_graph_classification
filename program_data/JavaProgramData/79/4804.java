package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int M;
		int i;
		int cur;
		int leave;
		int[] a = new int[301];
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				N = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			if (N == 0 && M == 0)
			{
				break;
			}

			for (i = 1; i <= N; i++)
			{
				a[i] = i;
			}
			cur = 1;
			while (true)
			{
				if (N == 1)
				{
					break;
				}
				leave = (cur + M - 1) % N;
				if (leave == 0)
				{
					leave = N;
					cur = 1;
				}
				else
				{
					cur = leave;
				}
				for (i = leave; i < N; i++)
				{
					a[i] = a[i + 1];
				}
				N--;
			}
			System.out.printf("%d\n", a[1]);
		}
		return 0;
	}
}

