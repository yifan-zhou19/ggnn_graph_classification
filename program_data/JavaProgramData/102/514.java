package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int nan = 0;
		int nv = 0;
		String s = new String(new char[10]);
		double h;
		double[] male = new double[40];
		double[] female = new double[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 h = Double.parseDouble(tempVar3);
			 }
			 if (s.length() == 4)
			 {
				 nan++;
				 male[nan - 1] = h;
			 }
			 else if (s.length() == 6)
			 {
				 nv++;
				 female[nv - 1] = h;
			 }
		}
		for (i = 1;i <= nan;i++)
		{
			 for (j = 0;j < nan - i;j++)
			 {
				 if (male[j] > male[j + 1])
				 {
					 double e;
					 e = male[j];
					 male[j] = male[j + 1];
					 male[j + 1] = e;
				 }
			 }
		}
		for (i = 1;i <= nv;i++)
		{
			 for (j = 0;j <= nv - i;j++)
			 {
				 if (female[j] < female[j + 1])
				 {
					 double e;
					 e = female[j];
					 female[j] = female[j + 1];
					 female[j + 1] = e;
				 }
			 }
		}
		System.out.printf("%.2lf",male[0]);
		for (i = 1;i < nan;i++)
		{
						  System.out.printf(" %.2lf",male[i]);
		}
		for (i = 0;i < nv;i++)
		{
						  System.out.printf(" %.2lf",female[i]);
		}
		return 0;
	}
}

