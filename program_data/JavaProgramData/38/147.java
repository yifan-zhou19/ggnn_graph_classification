package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[][] a = new double[100][100];
		double b;
		double s;
		int n;
		int m;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			b = 0;
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(a + i) + j = tempVar3;
				}
			}
			for (j = 0;j < m;j++)
			{
				b = b + a[i][j];
			}
			b = b / m;
			for (j = 0;j < m;j++)
			{
				s = s + Math.pow((a[i][j] - b),2);
			}
			s = s / m;
			s = Math.pow(s,0.5);
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}

}

