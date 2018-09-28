package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] credit = new int[10];
		int[] score = new int[10];
		int credit1 = 0;
		float[] point = new float[10];
		float gpa;
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				credit[i] = Integer.parseInt(tempVar2);
			}
		credit1 = credit1 + credit[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (score[i] >= 90 && score[i] <= 100)
			{
				point[i] = 4.0F;
			}
		 else if (score[i] >= 85)
		 {
			 point[i] = 3.7F;
		 }
		 else if (score[i] >= 82)
		 {
			 point[i] = 3.3F;
		 }
		  else if (score[i] >= 78)
		  {
			  point[i] = 3.0F;
		  }
		   else if (score[i] >= 75)
		   {
			   point[i] = 2.7F;
		   }
			else if (score[i] >= 72)
			{
				point[i] = 2.3F;
			}
			 else if (score[i] >= 68)
			 {
				 point[i] = 2.0F;
			 }
			  else if (score[i] >= 64)
			  {
				  point[i] = 1.5F;
			  }
			   else if (score[i] >= 60)
			   {
				   point[i] = 1.0F;
			   }
			   else
			   {
				   point[i] = 0F;
			   }
			   point[i] = point[i] * credit[i];
			   sum = sum + point[i];
		}
		gpa = sum / credit1;
		System.out.printf("%.2f",gpa);
	}

}

