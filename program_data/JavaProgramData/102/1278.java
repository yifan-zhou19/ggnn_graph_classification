package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		  double[] m = new double[40];
		  double[] f = new double[40];
		  int n;
		  int j = 0;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  s = tempVar2.charAt(0);
				  }
				  if (s.charAt(0) == 'm')
				  {
								String tempVar3 = ConsoleInput.scanfRead();
								if (tempVar3 != null)
								{
									m[j] = Double.parseDouble(tempVar3);
								}
								j++;
				  }
				  else if (s.charAt(0) == 'f')
				  {
								String tempVar4 = ConsoleInput.scanfRead();
								if (tempVar4 != null)
								{
									f[k] = Double.parseDouble(tempVar4);
								}
								k++;
				  }
		  }

		  for (int jj = j - 1;jj > 0;jj--)
		  {
		  for (int r = 0;r < jj;r++)
		  {
				if (m[r] > m[r + 1])
				{
				double tmp;
			 tmp = m[r + 1];
			 m[r + 1] = m[r];
			 m[r] = tmp;
				}
		  }

		  }

			for (int jj = k - 1;jj > 0;jj--)
			{
		  for (int r = 0;r < jj;r++)
		  {
				if (f[r] < f[r + 1])
				{
				double tmp;
			 tmp = f[r + 1];
			 f[r + 1] = f[r];
			 f[r] = tmp;
				}
		  }

			}

			for (int ii = 0;ii < j;ii++)
			{
			System.out.printf("%.2f ",m[ii]);
			}
	for (int ii = 0;ii < k;ii++)
	{
			System.out.printf("%.2f",f[ii]);
			if (ii < k - 1)
			{
			System.out.print(" ");
			}
	}




	}

}

