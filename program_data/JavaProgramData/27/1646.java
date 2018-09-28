package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double[] x1 = new double[100];
		double[] x2 = new double[100];
		double[] s1 = new double[100];
		double[] s2 = new double[100];
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
				 a = Double.parseDouble(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b = Double.parseDouble(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 c = Double.parseDouble(tempVar4);
			 }
			 if ((b * b - 4 * a * c) == 0)
			 {
				 x1[i] = x2[i] = (-b) / (2 * a);
				 s2[i] = 0.0;
			 }
			 else if ((b * b - 4 * a * c) > 0)
			 {
				 x1[i] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				 x2[i] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				 s2[i] = 0.0;
			 }
			 else if ((b * b - 4 * a * c) < 0)
			 {
				 s1[i] = (-b) / (2 * a);
				 if (s1[i] == -0.0)
				 {
					 s1[i] = 0.0;
				 }
				 s2[i] = Math.sqrt(4 * a * c - b * b) / (2 * a);
			 }
		}
		for (i = 1;i <= n;i++)
		{
			if (x1[i] == x2[i] && s2[i] == 0)
			{
				System.out.printf("x1=x2=%.5f\n",x1[i]);
			}
			   else if (x1[i] != x2[i] && s2[i] == 0)
			   {
				System.out.printf("x1=%.5f;x2=%.5f\n",x1[i],x2[i]);
			   }
			else
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",s1[i],s2[i],s1[i],s2[i]);
			}

		}

	return 0;
	}


}

