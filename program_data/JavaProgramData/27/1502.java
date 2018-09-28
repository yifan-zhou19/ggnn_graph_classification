package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	int i;
	int n;
	float a;
	float b;
	float c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double[][] d = new double[n][3];
	double x;
	double y;
	for (i = 0;i < n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = Float.parseFloat(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b = Float.parseFloat(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 c = Float.parseFloat(tempVar4);
		 }
		  x = b * b - 4 * a * c;
		if (x == 0)
		{
				d[i][1] = d[i][2] = -b / (2 * a);
				d[i][3] = x;
		}
		else if (x > 0)
		{
			  y = Math.sqrt(x);
			  d[i][1] = (-b + y) / (2 * a);
			  d[i][2] = (-b - y) / (2 * a);
			  d[i][3] = x;
		}
		else
		{
			   y = Math.sqrt(-x);
			   d[i][1] = -b / (2 * a);
			   d[i][2] = y / (2 * a);
			   d[i][3] = x;
		}
	}
	 for (i = 0;i < n;i++)
	 {
	   if (d[i][1] == -0)
	   {
	   d[i][1] = 0;
	   }
	   if (d[i][2] == -0)
	   {
	   d[i][2] = 0;
	   }
		 if (d[i][3] < 0)
		 {
		   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",d[i][1],d[i][2],d[i][1],d[i][2]);
		 }
		 else if (d[i][3] > 0)
		 {
			  System.out.printf("x1=%.5f;x2=%.5f\n",d[i][1],d[i][2]);
		 }
		 else
		 {
			  System.out.printf("x1=x2=%.5f\n",d[i][1]);
		 }
	 }
	 }

}

