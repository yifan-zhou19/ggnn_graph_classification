package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int d = 0;
	float gpa = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] c = new int[n];
	int[] p = new int[n];
	float[] gp = new float[n];
	for (int i = 0;i < n;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   c[i] = Integer.parseInt(tempVar2);
	   }
	   d += c[i];
	}
	for (int j = 0;j < n;j++)
	{
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   p[j] = Integer.parseInt(tempVar3);
	   }
	   if (p[j] > 89)
	   {
		   gp[j] = 4F;
	   }
		else if (p[j] > 84)
		{
			gp[j] = 3.7F;
		}
		 else if (p[j] > 81)
		 {
			 gp[j] = 3.3F;
		 }
		  else if (p[j] > 77)
		  {
			  gp[j] = 3F;
		  }
		   else if (p[j] > 74)
		   {
			   gp[j] = 2.7F;
		   }
			else if (p[j] > 71)
			{
				gp[j] = 2.3F;
			}
			 else if (p[j] > 67)
			 {
				 gp[j] = 2F;
			 }
			  else if (p[j] > 63)
			  {
				  gp[j] = 1.5F;
			  }
			   else if (p[j] > 59)
			   {
				   gp[j] = 1F;
			   }
				else
				{
					gp[j] = 0F;
				}
	   gpa += c[j] * gp[j];
	}
	gpa = gpa / d;
	System.out.printf("%.2f",gpa);
	}

}

