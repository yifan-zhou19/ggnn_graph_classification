package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
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
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		 for (i = 0;i < n;i++)
		 {
			 c[i] = b[i] / a[i];
		 }

	   for (i = 1;i < n;i++)
	   {
		   if (c[0] + 0.05 < c[i])
		   {
			   System.out.print("better\n");
		   }
		   else if (c[i] + 0.05 < c[0])
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

