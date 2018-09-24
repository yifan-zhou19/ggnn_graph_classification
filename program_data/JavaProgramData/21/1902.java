package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int j;
		int i = 0;
		int[] p = new int[300];
		int n;
		int y = 0;
		 float[] k = new float[300];
		 float b;
		 float a = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[m] = Integer.parseInt(tempVar2);
			}
		a = a + p[m];
		}
		b = a / n;
	   for (m = 0;m < n;m++)
	   {
		   if (p[m] - b >= 0F)
		   {
		   k[m] = p[m] - b;
		   }
	   else
	   {
		   k[m] = b - p[m];
	   }
	   }
		for (j = 1;j < n;j++)
		{
			if (k[j] > k[i])
			{
		i = j;
			}
		}
		for (m = 0;m < n;m++)
		{
			if (k[m] == k[i] && p[m] <= b)
			{
			  System.out.printf("%d",p[m]);
		y = 1;
			}
		}
		for (m = 0;m < n;m++)
		{
			if (k[m] == k[i] && p[m] > b)
			{
			if (y == 1)
			{
		  System.out.printf(",%d",p[m]);
			}
		else
		{
			System.out.printf("%d",p[m]);
		}
			}
		}
	}
}

