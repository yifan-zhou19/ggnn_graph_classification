package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int htr(int h);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int f = 0;
		double[] mh = new double[41];
		double[] fh = new double[41];
		double h;
		double e;
		String fm = new String(new char[7]);
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
				fm = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (fm.charAt(0) == 'f')
			{
			   fh[f] = h;
			   f++;
			}
			else
			{
			   mh[m] = h;
			   m++;
			}
		}
		 for (i = (m - 1);i > 0;i--)
		 {
			for (j = 0;j < i;j++)
			{
				if (mh[j] > mh[j + 1])
				{
				   e = mh[j];
				   mh[j] = mh[j + 1];
				   mh[j + 1] = e;
				}
			}
		 }
		 for (i = (f - 1);i > 0;i--)
		 {
			for (j = 0;j < i;j++)
			{
				if (fh[j] < fh[j + 1])
				{
				   e = fh[j];
				   fh[j] = fh[j + 1];
				   fh[j + 1] = e;
				}
			}
		 }
		 for (i = 0;i < m;i++)
		 {
			 System.out.printf("%.2lf ",mh[i]);
		 }
		 for (i = 0;i < (f - 1);i++)
		 {
			 System.out.printf("%.2lf ",fh[i]);
		 }
		 System.out.printf("%.2lf",fh[f - 1]);
		 return 0;
	}
}

