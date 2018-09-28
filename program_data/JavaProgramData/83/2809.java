package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[10];
		int[] a = new int[10];
		int i;
		int j;
		int s1 = 0;
		float b;
		float s2 = 0F;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[j] = Integer.parseInt(tempVar2);
			}
			s1 += x[j];
		}
		for (i = 0,j = 0;i < n,j < n;i++,j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] <= 100 && a[i] >= 90)
			{
		   b = 4.0F;
			}
			if (a[i] <= 89 && a[i] >= 85)
			{
		   b = 3.7F;
			}
			if (a[i] <= 84 && a[i] >= 82)
			{
		   b = 3.3F;
			}
			if (a[i] <= 81 && a[i] >= 78)
			{
		   b = 3.0F;
			}
			if (a[i] <= 77 && a[i] >= 75)
			{
		   b = 2.7F;
			}
			if (a[i] <= 74 && a[i] >= 72)
			{
		   b = 2.3F;
			}
			if (a[i] <= 71 && a[i] >= 68)
			{
		   b = 2.0F;
			}
			if (a[i] <= 67 && a[i] >= 64)
			{
		   b = 1.5F;
			}
			if (a[i] <= 63 && a[i] >= 60)
			{
		   b = 1.0F;
			}
			if (a[i] < 60)
			{
		   b = 0F;
			}
			s2 = s2 + x[j] * b;
		}
		 GPA = s2 / s1;
		 System.out.printf("%.2f",GPA);
		 return 0;
	}

}

