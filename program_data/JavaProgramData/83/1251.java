package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int m = 0;
		float g;
		float s = 0F;
		float[] t = new float[10];
		float gpa;
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
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
		   if (a[i] >= 90)
		   {
			   g = 4.0F;
		   }
		  else if (a[i] >= 85)
		  {
			  g = 3.7F;
		  }
		  else if (a[i] >= 82)
		  {
			  g = 3.3F;
		  }
		  else if (a[i] >= 78)
		  {
			  g = 3.0F;
		  }
		  else if (a[i] >= 75)
		  {
			  g = 2.7F;
		  }
		  else if (a[i] >= 72)
		  {
			  g = 2.3F;
		  }
		  else if (a[i] >= 68)
		  {
			  g = 2.0F;
		  }
		  else if (a[i] >= 64)
		  {
			  g = 1.5F;
		  }
		  else if (a[i] >= 60)
		  {
			  g = 1.0F;
		  }
		  else
		  {
			  g = 0F;
		  }
		  t[i] = g;
		  s = s + b[i] * t[i];
		m = m + b[i];

		}

		gpa = s / m;
		System.out.printf("%.2f",gpa);


	}
}

