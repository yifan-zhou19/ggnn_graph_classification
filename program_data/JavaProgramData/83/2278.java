package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int zongxf;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 int[] xf = new int[n];
		 int[] df = new int[n];
		 double gpa;
		 double s;
		 double[] jd = new double[n];
		 for (i = 0;i < n;i++)
		 {
			 xf[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (i = 0;i < n;i++)
		 {
			 df[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (i = 0;i < n;i++)
		 {
						  if (df[i] >= 90 && df[i] <= 100)
						  {
							  jd[i] = 4.0;
						  }
						  else if (df[i] >= 85 && df[i] <= 89)
						  {
							  jd[i] = 3.7;
						  }
						  else if (df[i] >= 82 && df[i] <= 84)
						  {
							  jd[i] = 3.3;
						  }
						  else if (df[i] >= 78 && df[i] <= 81)
						  {
							  jd[i] = 3.0;
						  }
						  else if (df[i] >= 75 && df[i] <= 77)
						  {
							  jd[i] = 2.7;
						  }
						  else if (df[i] >= 72 && df[i] <= 74)
						  {
							  jd[i] = 2.3;
						  }
						  else if (df[i] >= 68 && df[i] <= 71)
						  {
							  jd[i] = 2.0;
						  }
						  else if (df[i] >= 64 && df[i] <= 67)
						  {
							  jd[i] = 1.5;
						  }
						  else if (df[i] >= 60 && df[i] <= 63)
						  {
							  jd[i] = 1.0;
						  }
						  else
						  {
							  jd[i] = 0;
						  }
		 }

		 s = 0;
		 zongxf = 0;
		  for (i = 0;i < n;i++)
		  {
				s = s + jd[i] * xf[i];
				zongxf = zongxf + xf[i];

		  }
		 gpa = s / zongxf;
		 System.out.printf("%.2f",gpa);
		 return 0;
	}
}

