package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int r = 0;
		int y = 0;
		char[][] s = new char[100][100];
		double[] b = new double[100];
		double[] m = new double[100];
		double[] w = new double[100];
		double temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2 * n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							s[i] = tempVar2.charAt(0);
						}
		}
		for (i = 0;i < 2 * n;i++)
		{
						  if (((i % 2) == 0) && (s[i][0] == 'm'))
						  {
													   m[r] = Double.parseDouble(s[i + 1]);
													   r++;
						  }
						  else if (((i % 2) == 0) && (s[i][0] == 'f'))
						  {
							   w[y] = Double.parseDouble(s[i + 1]);
							   y++;
						  }
		}
		for (i = 1;i < r;i++)
		{
						for (j = 0;j < r - i;j++)
						{
										   if (m[j] > m[j + 1])
										   {
														  temp = m[j];
														  m[j] = m[j + 1];
														  m[j + 1] = temp;
										   }
						}
		}
		 for (i = 1;i < y;i++)
		 {
						for (j = 0;j < y - i;j++)
						{
										   if (w[j] < w[j + 1])
										   {
														  temp = w[j];
														  w[j] = w[j + 1];
														  w[j + 1] = temp;
										   }
						}
		 }
		System.out.printf("%.2f",m[0]);
		for (i = 1;i < r;i++)
		{
		System.out.printf(" %.2f",m[i]);
		}
		for (i = 0;i < y;i++)
		{
		System.out.printf(" %.2f",w[i]);
		}
	}
}

