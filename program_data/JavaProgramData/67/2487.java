package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		  float[] a = new float[n];
		  float[] b = new float[n];
		  float[] c = new float[n];
		  for (int i = 0;i < n;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Float.parseFloat(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 b[i] = Float.parseFloat(tempVar3);
			 }
		  c[i] = b[i] / a[i];
		  }
		  for (int i = 1;i < n;i++)
		  {
			  if (c[i] - c[0] > 0.05F)
			  {
		   System.out.print("better\n");
			  }
		   else if (c[0] - c[i] > 0.05F)
		   {
		   System.out.print("worse\n");
		   }
		   else
		   {
		   System.out.print("same\n");
		   }
		  }




	}
}

