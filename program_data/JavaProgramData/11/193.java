package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n = 0;
		int N;
		int y;
		int m;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (y % 100 != 0 && y % 4 == 0)
		{
			int[] p = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (d < 1 || d> p[m])
			{
				System.out.print("Illegal input.\n");
			}
			else
			{
				int j;
				for (j = 0;j < m;j++)
				{
					n = n + p[j];
				}
				N = n + d;
				System.out.printf("%d\n",N);
			}
		}
		else if (y % 4 != 0)
		{
			int[] q = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (d < 1 || d> q[m])
			{
				System.out.print("Illegal input.\n");
			}
			else
			{
				int j;
				for (j = 0;j < m;j++)
				{
					n = n + q[j];
				}
				N = n + d;
				System.out.printf("%d\n",N);
			}

		}
	}
}

