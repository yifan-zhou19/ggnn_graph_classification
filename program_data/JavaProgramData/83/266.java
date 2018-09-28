package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int s = 0;
	 float GPA;
	 float t = 0F;
	 float[][] c = new float[3][9];
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
			 c[1][i] = Float.parseFloat(tempVar2);
		 }
	  s = s + c[1][i];
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 c[2][i] = Float.parseFloat(tempVar3);
		 }
	  if (c[2][i] < 60F)
	  {
	   c[0][i] = 0F;
	  }
	  else if (c[2][i] <= 63F)
	  {
	   c[0][i] = 1.0F;
	  }
	  else if (c[2][i] <= 67F)
	  {
	   c[0][i] = 1.5F;
	  }
	  else if (c[2][i] <= 71F)
	  {
	   c[0][i] = 2.0F;
	  }
	  else if (c[2][i] <= 74F)
	  {
	   c[0][i] = 2.3F;
	  }
	  else if (c[2][i] <= 77F)
	  {
	   c[0][i] = 2.7F;
	  }
	  else if (c[2][i] <= 81F)
	  {
	   c[0][i] = 3F;
	  }
	  else if (c[2][i] <= 84F)
	  {
	   c[0][i] = 3.3F;
	  }
	  else if (c[2][i] <= 89F)
	  {
	   c[0][i] = 3.7F;
	  }
	  else
	  {
		  c[0][i] = 4.0F;
	  }
	  t = t + c[1][i] * c[0][i];
	 }
	  GPA = t / s;
	 System.out.printf("%.2f",GPA);
	}
}

