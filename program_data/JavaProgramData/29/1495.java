package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  int m;
		  int[] b = new int[1000];
		  float[] p = new float[1000];
		  float[] q = new float[1000];
		  float sum;
		  p[0] = 2F;
		  p[1] = 3F;
		  q[0] = 1F;
		  q[1] = 2F;
		  sum = p[0] / q[0] + p[1] / q[1];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  for (j = 0;j < m;j++)
		  {
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   n = Integer.parseInt(tempVar2);
						   }
						   if (n == 1)
						   {
						   System.out.printf("%.3f\n",p[0] / q[0]);
						   }
						   else if (n == 2)
						   {
						   System.out.printf("%.3f\n",sum);
						   }
						   else
						   {
							   for (i = 2;i < n;i++)
							   {
										 p[i] = p[i - 1] + p[i - 2];
										 q[i] = q[i - 1] + q[i - 2];
										 sum = sum + p[i] / q[i];
							   }
						   System.out.printf("%.3f\n",sum);
							sum = p[0] / q[0] + p[1] / q[1];
						   }
		  }
		  System.in.read();
	}

}

