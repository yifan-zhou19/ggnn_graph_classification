package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


		int[] a = new int[300];
		int[] b = new int[300];
		int j = 0;
		int i;
		int n;
		int k;
		int m;
		int t;
		float c;
		float max;
		float sum = 0F;
		float[] d = new float[300];
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
	  }
	  for (i = 0;i < n;i++)
	  {
		 sum = sum + a[i];
	  }
	   c = sum / n;
	   for (i = 0;i < n;i++)
	   {
		   if (c - a[i] >= 0)
		   {
			   d[i] = c - a[i];
		   }
		   else
		   {
			   d[i] = a[i] - c;
		   }
	   }
	   max = d[0];
	   for (i = 0;i < n;i++)
	   {
		  if (d[i] > max)
		  {
			   max = d[i];
		  }
	   }


	   for (i = 0;i < n;i++)
	   {
		   if (d[i] == max)
		   {
			   b[j] = a[i];
			   j++;
		   }
	   }
		for (k = 0;k < (j - 1);k++)
		{
			for (m = 0,t = 0;m < (j - 1 - k);m++)
			{
				if (b[m] > b[m + 1])
				{
					t = b[m];
					b[m] = b[m + 1];
					b[m + 1] = t;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}
}

