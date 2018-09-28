package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double a;
		double b;
		double c;
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[][] d = new float[n][3];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[i][0] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d[i][1] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				d[i][2] = Float.parseFloat(tempVar4);
			}
		}
		for (j = 0;j < n;j++)
		{
		   a = d[j][0];
		   b = d[j][1];
		   c = d[j][2];
		   if ((b * b - 4 * a * c) > 0)
		   {
			   x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			   y = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			   System.out.printf("x1=%.5f;x2=%.5f\n",x,y);
		   }
		   else if ((b * b - 4 * a * c) == 0)
		   {
			   x = -b / (2 * a);
			   System.out.printf("x1=x2=%.5f\n",x);
		   }
		   else
		   {
			  x = -b / (2 * a);
			  y = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
			  if (x == 0)
			  {
			  System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",y,y);
			  }
			  else
			  {
			  System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x,y,x,y);
			  }
		   }
		}
	}

}

