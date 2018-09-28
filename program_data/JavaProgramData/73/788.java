package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[5][5];
		int[] m = new int[5];
		int[] h = new int[5];
		int[] l = new int[5];
		int n = 0;
		int[] an = new int[5];
		int[] hh = new int[5];
		int[] ll = new int[5];
		int k = 0;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		m[0] = x[0][0];
		m[1] = x[1][0];
		m[2] = x[2][0];
		m[3] = x[3][0];
		m[4] = x[4][0];
		h[0] = 1;
		h[1] = 2;
		h[2] = 3;
		h[3] = 4;
		h[4] = 5;
		l[0] = 1;
		l[1] = 2;
		l[2] = 3;
		l[3] = 4;
		l[4] = 5;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (m[i] <= x[i][j])
				{
					m[i] = x[i][j];
					l[i] = j;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			if (m[i] <= x[0][l[i]] != 0 && m[i] <= x[1][l[i]] != 0 && m[i] <= x[2][l[i]] != 0 && m[i] <= x[3][l[i]] != 0 && m[i] <= x[4][l[i]])
			{
				n += 1;
				an[k] = m[i];
				hh[k] = h[i];
				ll[k] = l[i] + 1;
				k += 1;
			}
		}
		if (n == 0)
		{
			System.out.print("not found");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				System.out.printf("%d %d %d",hh[i],ll[i],an[i]);
			}
		}
		return 0;
	}
}

