package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int M;
		int q;
		int m;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] b = new int[200];
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				M = Integer.parseInt(tempVar4);
			}
			if (m > M)
			{
				q = m;
				m = M;
				M = q;
			}
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{

				a[2] = 29;
				for (s = 0,m;m < M;m++)
				{
					s += a[m];
				}
				if (s % 7 == 0)
				{
					b[i] = 1;
				}
				else
				{
					b[i] = 0;
				}
			}

			else
			{
				a[2] = 28;
				for (s = 0,m;m < M;m++)
				{
					s += a[m];
				}
				if (s % 7 == 0)
				{
					b[i] = 1;
				}
				else
				{
					b[i] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 1)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}

		return 0;

	}
}

