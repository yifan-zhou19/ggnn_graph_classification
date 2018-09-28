public class point
{
   public double x;
   public double y;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   point a;
	   double maxd = 0;
	   double d;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	   a = (point)malloc(sizeof(point) * n);
	   for (i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  ((a + i).x) = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  ((a + i).y) = Double.parseDouble(tempVar3);
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		 for (j = 0;j < n;j++)
		 {
			 d = ((a + i).x - (a + j).x) * ((a + i).x - (a + j).x) + ((a + i).y - (a + j).y) * ((a + i).y - (a + j).y);
			 if (d > maxd)
			 {
				 maxd = d;
			 }
		 }
	   }
	   System.out.printf("%.4f",Math.sqrt(maxd));
	}


}

