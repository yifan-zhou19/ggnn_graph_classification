package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  float[] a = new float[4];
		  float k;
		  float c;
		  int i;
		  for (i = 0;i < 4;i++)
		  {
						  String tempVar = ConsoleInput.scanfRead();
						  if (tempVar != null)
						  {
							  a[i] = Float.parseFloat(tempVar);
						  }
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  c = Float.parseFloat(tempVar2);
		  }
		  c = 2 * 3.1415926 * c / 360;
		  k = (a[0] + a[1] + a[2] + a[3]) / 2;
		  double s;
		  double sq;
		  sq = (k - a[0]) * (k - a[1]) * (k - a[2]) * (k - a[3]) - a[0] * a[1] * a[2] * a[3] * (double)Math.cos(c / 2) * (double)Math.cos(c / 2);

		  if (sq < 0)
		  {
		  System.out.print("Invalid input");
		  }
		  else
		  {
			  s = Math.sqrt(sq);
			  System.out.printf("%.4f",s);
		  }

	}

}

