package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int[] s = new int[500];
		int m = 0;
		int[] q = new int[500];
		int j;
		int t;
		int z;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			z = s[i] % 2;
			if (z == 1)
			{
				m = m + 1;
				j = m - 1;
				q[j] = s[i];
			}

			i++;
		}
		j = 1;
		while (j < m)
		{
			u = j;
			while (j > 0)
			{

				if (q[j] < q[j - 1])
				{
					t = q[j - 1];
					q[j - 1] = q[j];
					q[j] = t;
				}
				j--;
			}
			j = u + 1;
		}
		j = 0;
		while (j < m)
		{
			if (j == m - 1)
			{
				System.out.printf("%d",q[j]);

			}
			else
			{

				 System.out.printf("%d"",",q[j]);
			}
			j++;
		}
		return 0;
	}
}

