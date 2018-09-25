package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int boy;
		int girl;
		int i;
		int j;
		double[] h = new double[50];
		double[] b = new double[50];
		double[] g = new double[50];
		double e;
		String gender = new String(new char[10]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 boy = 0;
		 girl = 0;
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  gender = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  h[i] = Double.parseDouble(tempVar3);
		  }
		  if (gender.charAt(0) == 'm')
		  {
			  b[boy] = h[i];
			  boy++;
		  }
		  else if (gender.charAt(0) == 'f')
		  {
			  g[girl] = h[i];
			  girl++;
		  }
		}

		  for (i = 0;i < boy;i++)
		  {
			 for (j = 0;j < boy - 1;j++)
			 {
			 if (b[j] > b[j + 1])
			 {
				 e = b[j];
				 b[j] = b[j + 1];
				 b[j + 1] = e;
			 }
			 }
		  }
		 for (i = 0;i < girl;i++)
		 {
			 for (j = 0;j < girl - 1;j++)
			 {
			 if (g[j] < g[j + 1])
			 {
				 e = g[j];
				 g[j] = g[j + 1];
				 g[j + 1] = e;
			 }
			 }
		 }
		 System.out.printf("%.2lf",b[0]);
		  for (i = 1;i < boy;i++)
		  {
			  System.out.printf(" %.2lf",b[i]);
		  }
		 for (i = 0;i < girl;i++)
		 {
			  System.out.printf(" %.2lf",g[i]);
		 }



	return 0;
	}

}

