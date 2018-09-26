package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[200][200];
		int t;
		int n;
		int m;
		int i;
		int j;
		int s;
		int[] p = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
		{
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
			p = a;
			for (i = 0;i < n;i++)
			{
			for (j = 0;j < m;j++)
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p[i] + j = tempVar4;
			}
			}
			}
			s = 0;
			for (i = 0;i < m;i++)
			{
				s = s + *(p[0] + i);
			}
			if (n > 1)
			{
			for (i = 0;i < m;i++)
			{
				s = s + *(p[n - 1] + i);
			}
			}
			for (i = 1;i < n - 1;i++)
			{
				s = s + *(p[i]);
			}
			if (m > 1)
			{
			for (i = 1;i < n - 1;i++)
			{
				s = s + *(p[i] + m - 1);
			}
			}
			System.out.printf("%d\n",s);
		}
	}
}

