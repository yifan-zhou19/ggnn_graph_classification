package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int n;
		int i;
		float[] c = new float[11];
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i] = Integer.parseInt(tempVar2);
			   }
			   a[0] = a[0] + a[i];
		}

		for (i = 1;i <= n;i++)
		{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b[i] = Integer.parseInt(tempVar3);
			   }
			   if (b[i] < 60)
			   {
				   c[i] = 0F;
			   }
			   else if (b[i] <= 63 && b[i] >= 60)
			   {
				   c[i] = a[i] * 1.0;
			   }
			   else if (b[i] <= 67 && b[i] >= 64)
			   {
				   c[i] = a[i] * 1.5;
			   }
			   else if (b[i] <= 71 && b[i] >= 68)
			   {
				   c[i] = a[i] * 2.0;
			   }
			   else if (b[i] <= 74 && b[i] >= 72)
			   {
				   c[i] = a[i] * 2.3;
			   }
			   else if (b[i] <= 77 && b[i] >= 75)
			   {
				   c[i] = a[i] * 2.7;
			   }
			   else if (b[i] <= 81 && b[i] >= 78)
			   {
				   c[i] = a[i] * 3.0;
			   }
			   else if (b[i] <= 84 && b[i] >= 82)
			   {
				   c[i] = a[i] * 3.3;
			   }
			   else if (b[i] <= 89 && b[i] >= 85)
			   {
				   c[i] = a[i] * 3.7;
			   }
			   else if (b[i] <= 100 && b[i] >= 90)
			   {
				   c[i] = a[i] * 4.0;
			   }
		}

		for (i = 1;i <= n;i++)
		{
			c[0] = c[0] + c[i];
		}

		GPA = c[0] / a[0];
		System.out.printf("%.2f",GPA);
	}

}

