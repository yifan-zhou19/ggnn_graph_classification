package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n = 0;
	   int[] xuefen = new int[10];
	   int[] defen = new int[10];
	   int i = 0;
	   float num = 0F;
	   float fen = 0F;
	   float GPA = 0F;
	   float[] gpa = new float[10];
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
			   xuefen[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   defen[i] = Integer.parseInt(tempVar3);
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
		  if (defen[i] > 89)
		  {
			  gpa[i] = 4F;
		  }
		  else if (defen[i] > 84 && defen[i] < 90)
		  {
			  gpa[i] = 3.7F;
		  }
		  else if (defen[i] > 81 && defen[i] < 85)
		  {
			  gpa[i] = 3.3F;
		  }
		  else if (defen[i] > 77 && defen[i] < 82)
		  {
			  gpa[i] = 3F;
		  }
		  else if (defen[i] > 74 && defen[i] < 78)
		  {
			  gpa[i] = 2.7F;
		  }
		  else if (defen[i] > 71 && defen[i] < 75)
		  {
			  gpa[i] = 2.3F;
		  }
		  else if (defen[i] > 67 && defen[i] < 72)
		  {
			  gpa[i] = 2F;
		  }
		  else if (defen[i] > 63 && defen[i] < 68)
		  {
			  gpa[i] = 1.5F;
		  }
		  else if (defen[i] > 59 && defen[i] < 64)
		  {
			  gpa[i] = 1F;
		  }
		  else if (defen[i] < 60)
		  {
			  gpa[i] = 0F;
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		  num = num + gpa[i] * xuefen[i];
		  fen = fen + xuefen[i];
	   }
	   GPA = num / fen;
	   System.out.printf("%.2f\n",GPA);
	}

}

