package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] ns = new double[40];
		double[] vs = new double[40];
		char[][] xsz = new char[45][10];
		int n;
		int a;
		int b;
		int f;
		int g;
		double c;
		f = 0;
		g = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 0;a < n;a++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  xsz[a] = tempVar2.charAt(0);
			  }
			  if (xsz[a][0] == 'm')
			  {
				   String tempVar3 = ConsoleInput.scanfRead();
				   if (tempVar3 != null)
				   {
					   ns[f] = Double.parseDouble(tempVar3);
				   }
				   f++;
			  }
			  else
			  {
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						vs[g] = Double.parseDouble(tempVar4);
					}
					g++;
			  }
		}
		for (a = 1;a <= f;a++)
		{
			 for (b = 0;b < f - a;b++)
			 {
				   if (ns[b] > ns[b + 1])
				   {
						 c = ns[b];
						 ns[b] = ns[b + 1];
						 ns[b + 1] = c;
				   }
			 }
		}
		  for (a = 1;a <= g;a++)
		  {
			 for (b = 0;b < g - a;b++)
			 {
				   if (vs[b + 1] > vs[b])
				   {
						 c = vs[b];
						 vs[b] = vs[b + 1];
						 vs[b + 1] = c;
				   }
			 }
		  }
		 for (a = 0;a < f;a++)
		 {

				 System.out.printf("%.2lf ",ns[a]);
		 }
		 for (a = 0;a < g - 1;a++)
		 {
			 System.out.printf("%.2lf ",vs[a]);
		 }
		 System.out.printf("%.2lf",vs[a]);
		 return 0;
	}



}

