package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[][] a = new int[10][10];
		int t = 0;
		int q;
		int qq;
		int p = 1;
		int max;
		String s = new String(new char[3]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		n = s.charAt(0) - 48;
		m = s.charAt(2) - 48;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			max = a[i][0];
		for (j = 0;j < m;j++)
		{
			if (max < a[i][j])
			{
			max = a[i][j];
			q = j;
			} //printf("LLL%d  %d",max,q);}
		}
		for (k = 0;k < n;k++)
		{
			if (max > a[k][q])
			{
				p = 0;
			}
		}
			if (p == 1)
			{
				for (k = 0;k < n;k++)
				{
					if (a[k][q] == max)
					{
						qq = k;
					}
				}
				System.out.printf("%d+%d",qq,q);
				t++;
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
	}
}

