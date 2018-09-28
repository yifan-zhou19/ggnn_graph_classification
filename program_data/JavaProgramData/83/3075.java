package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[11];
		int[] b = new int[11];
		float[] c = new float[11];
		int[] d = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		while (scanf("%d", n) != EOF)
		{
			float sum = 0F;
			int asum = 0;
			 for (i = 1;i <= n;i++)
			 {
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 a[i] = Integer.parseInt(tempVar);
				 }
				 asum += a[i];
			 }
			 for (i = 1;i <= n;i++)
			 {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  b[i] = Integer.parseInt(tempVar2);
				  }
			 }
			 for (i = 1;i <= n;i++)
			 {
				  if (b[i] >= 90 && b[i] <= 100)
				  {
					  c[i] = 4.0F;
				  }
				  else if (b[i] >= 85 && b[i] <= 89)
				  {
					  c[i] = 3.7F;
				  }
				  else if (b[i] >= 82 && b[i] <= 84)
				  {
					  c[i] = 3.3F;
				  }
				  else if (b[i] >= 78 && b[i] <= 81)
				  {
					  c[i] = 3.0F;
				  }
				  else if (b[i] >= 75 && b[i] <= 77)
				  {
					  c[i] = 2.7F;
				  }
				  else if (b[i] >= 72 && b[i] <= 74)
				  {
					  c[i] = 2.3F;
				  }
				  else if (b[i] >= 68 && b[i] <= 71)
				  {
					  c[i] = 2.0F;
				  }
				  else if (b[i] >= 64 && b[i] <= 67)
				  {
					  c[i] = 1.5F;
				  }
				  else if (b[i] >= 60 && b[i] <= 63)
				  {
					  c[i] = 1.0F;
				  }
				  else
				  {
					  c[i] = 0F;
				  }
			 }
			 for (i = 1;i <= n;i++)
			 {
				  sum += a[i] * c[i];
			 }
			 System.out.printf("%.2f\n",sum / asum);


		}

		return 0;
	}

}

