package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int k;
	   float bz;
	   float qt;
	   float cha;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[][] gs = new int[1000][2];
	   for (i = 0;i < n;i++)
	   {
			for (k = 0;k < 2;k++)
			{
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 gs[i][k] = Integer.parseInt(tempVar2);
				 }
			}
	   }
	   bz = (float)gs[0][1] / gs[0][0];
	   for (i = 1;i < n;i++)
	   {
			qt = (float)gs[i][1] / gs[i][0];
			cha = qt - bz;
			if (cha > 0.05F)
			{
				 System.out.print("better\n");
			}
			 else if (cha < -0.05F)
			 {
				   System.out.print("worse\n");
			 }
			 else
			 {
				 System.out.print("same\n");
			 }
	   }
	   return 0;
	}







}

