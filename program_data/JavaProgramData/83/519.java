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
		float GPA;
		float s = 0.0F;
		float m = 0.0F;
		float[] j = new float[n];
		int[] x = new int[n];
		int[] c = new int[n];
		for (int t = 0;t < n;t++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (x[t]) = Integer.parseInt(tempVar2);
		   }
		}
		for (int j = 0;j < n;j++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   (c[j]) = Integer.parseInt(tempVar3);
		   }
		}
		for (int i = 0;i < n;i++)
		{
		   if (c[i] >= 90)
		   {
			 j[i] = 4.0;
		   }
		   else if (c[i] >= 85)
		   {
			 j[i] = 3.7;
		   }
		   else if (c[i] >= 82)
		   {
			 j[i] = 3.3;
		   }
		   else if (c[i] >= 78)
		   {
			 j[i] = 3.0;
		   }
		   else if (c[i] >= 75)
		   {
			 j[i] = 2.7;
		   }
		   else if (c[i] >= 72)
		   {
			 j[i] = 2.3;
		   }
		   else if (c[i] >= 68)
		   {
			 j[i] = 2.0;
		   }
		   else if (c[i] >= 65)
		   {
			 j[i] = 1.5;
		   }
		   else if (c[i] >= 60)
		   {
			 j[i] = 1.0;
		   }
		   else
		   {
			 j[i] = 0.0;
		   }
		   s += (j[i]) * (x[i]);
		   m += x[i];
		}
		GPA = s / m;
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

