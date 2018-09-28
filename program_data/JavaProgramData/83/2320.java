package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int n;
	   int xft = 0;
	   int[] xf = new int[10];
	   int[] score = new int[10];
	   float GPA = 0F;
	   float[] jd = new float[10];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   xf[i] = Integer.parseInt(tempVar2);
		   }
		   xft = xft + xf[i];
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   score[i] = Integer.parseInt(tempVar3);
		   }
		   if (score[i] >= 90)
		   {
			   jd[i] = 4.0F;
		   }
		   else if (score[i] >= 85)
		   {
			   jd[i] = 3.7F;
		   }
		   else if (score[i] >= 82)
		   {
			   jd[i] = 3.3F;
		   }
		   else if (score[i] >= 78)
		   {
			   jd[i] = 3.0F;
		   }
		   else if (score[i] >= 75)
		   {
			   jd[i] = 2.7F;
		   }
		   else if (score[i] >= 72)
		   {
			   jd[i] = 2.3F;
		   }
		   else if (score[i] >= 68)
		   {
			   jd[i] = 2.0F;
		   }
		   else if (score[i] >= 64)
		   {
			   jd[i] = 1.5F;
		   }
		   else if (score[i] >= 60)
		   {
			   jd[i] = 1.0F;
		   }
		   else if (score[i] >= 0)
		   {
			   jd[i] = 0F;
		   }
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		   GPA = GPA + xf[i] * jd[i];
	   }
	   GPA = GPA / xft;
	   System.out.printf("%.2f",GPA);
	}
}

