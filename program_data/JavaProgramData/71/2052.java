package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int k;
			int d;
			int n;
			int[] y = new int[200];
			int[] m1 = new int[200];
			int[] m2 = new int[200];
			int i;
			int e;
			int[] m = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 0;i < n;i++)
			{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						y[i] = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						m1[i] = Integer.parseInt(tempVar3);
					}
					String tempVar4 = ConsoleInput.scanfRead(" ");
					if (tempVar4 != null)
					{
						m2[i] = Integer.parseInt(tempVar4);
					}

			if (y[i] % 100 != 0 && y[i] % 4 == 0 || y[i] % 400 == 0)
			{
				m[2] = 29;
			}
			else
			{
				m[2] = 28;
			}
			if (m1[i] > m2[i])
			{
				e = m2[i];
				m2[i] = m1[i];
				m1[i] = e;
			}
			d = 0;
			for (k = m1[i];k < m2[i];k++)
			{
					 d += m[k];
			}
			if (d % 7 == 0)
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

