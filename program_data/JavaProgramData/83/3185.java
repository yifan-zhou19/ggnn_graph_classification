package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		float[] c = new float[10];
		float y = 0.0F;
		float GPA;
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
			   a[i] = Integer.parseInt(tempVar2);
		   }
		   x += a[i];
		}
		for (i = 0;i < n;i++)
		{
		   if (i < n - 1)
		   {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  b[i] = Integer.parseInt(tempVar3);
			  }
		   }
		   else
		   {
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  b[i] = Integer.parseInt(tempVar4);
			  }
		   }
		}
		for (i = 0;i < n;i++)
		{
		   if (b[i] <= 60)
		   {
			  c[i] = 0F;
		   }
		   else if (b[i] <= 63)
		   {
			  c[i] = 1.0F;
		   }
		   else if (b[i] <= 67)
		   {
			  c[i] = 1.5F;
		   }
		   else if (b[i] <= 71)
		   {
			  c[i] = 2.0F;
		   }
		   else if (b[i] <= 74)
		   {
			  c[i] = 2.3F;
		   }
		   else if (b[i] <= 77)
		   {
			  c[i] = 2.7F;
		   }
		   else if (b[i] <= 81)
		   {
			  c[i] = 3.0F;
		   }
		   else if (b[i] <= 84)
		   {
			  c[i] = 3.3F;
		   }
		   else if (b[i] <= 89)
		   {
			  c[i] = 3.7F;
		   }
		   else
		   {
			  c[i] = 4.0F;
		   }
		   y += (c[i]) * (a[i]);
		}
		GPA = y / x;
		System.out.printf("%.2f",GPA);
		return 0;
	}


}

