package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k;
	 int[] m = new int[10];
	 float r = 0F;
	 float g = 0F;
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
		  m[i] = Integer.parseInt(tempVar2);
	  }
	  r += m[i];
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  k = Integer.parseInt(tempVar3);
	  }
	  if (k < 60)
	  {
		  g += 0 * m[i];
	  }
	  else if (k <= 63)
	  {
		  g += 1.0 * m[i];
	  }
	  else if (k <= 67)
	  {
		  g += 1.5 * m[i];
	  }
	  else if (k <= 71)
	  {
		  g += 2.0 * m[i];
	  }
	  else if (k <= 74)
	  {
		  g += 2.3 * m[i];
	  }
	  else if (k <= 77)
	  {
		  g += 2.7 * m[i];
	  }
	  else if (k <= 81)
	  {
		  g += 3.0 * m[i];
	  }
	  else if (k <= 84)
	  {
		  g += 3.3 * m[i];
	  }
	  else if (k <= 89)
	  {
		  g += 3.7 * m[i];
	  }
	  else
	  {
		  g += 4.0 * m[i];
	  }
	 }
	 System.out.printf("%.2f\n",g / r);
	}

}

