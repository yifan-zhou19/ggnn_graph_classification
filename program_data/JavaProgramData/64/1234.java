package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 1;
		int n;
		int[][] sa = new int[100][3];
		int b = 0;
	double[] s = new double[100];
	double[][] point = new double[10][3];
	double a;
	double c;
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
			 point[i][0] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 point[i][1] = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 point[i][2] = Double.parseDouble(tempVar4);
		 }
	 }

	 for (i = 0;i < n - 1;i++)
	 {
			for (j = i + 1;j < n;j++,k++)
			{
				 c = (point[i][0] - point[j][0]) * (point[i][0] - point[j][0]) + (point[i][1] - point[j][1]) * (point[i][1] - point[j][1]) + (point[i][2] - point[j][2]) * (point[i][2] - point[j][2]);
			  s[k] = Math.sqrt(c);
			  sa[k][1] = i;
			  sa[k][2] = j;
			}
	 }

	  for (i = 1;i < k;i++)
	  {
			 for (j = k - 1;j > 1;j--)
			 {
			  if (s[j] > s[j - 1] + 0.000001)
			  {
					s[j - 1] = s[j] + s[j - 1];
				 s[j] = s[j - 1] - s[j];
				 s[j - 1] = s[j - 1] - s[j];
				 b = sa[j][1];
				 sa[j][1] = sa[j - 1][1];
				 sa[j - 1][1] = b;
				 b = sa[j][2];
				 sa[j][2] = sa[j - 1][2];
				 sa[j - 1][2] = b;

			  }
			 }
	  }
	 for (i = 1;i < k;i++)
	 {
			 b = sa[i][1];
		  System.out.printf("(%.0lf,%.0lf,%.0lf)-",point[b][0],point[b][1],point[b][2]);
		  b = sa[i][2];
		  System.out.printf("(%.0lf,%.0lf,%.0lf)=",point[b][0],point[b][1],point[b][2]);
		System.out.printf("%.2lf\n", s[i]);
	 }

	}
}

