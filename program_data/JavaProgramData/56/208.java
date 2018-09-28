package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b = 0;
		int[][] a = new int[4][1];
		double t = 0;
		int[] c = new int[5];
		int i;
		int j;
		int f;
		int k;
		for (i = 0;i < 4;i++)
		{
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   a[i][0] = Integer.parseInt(tempVar);
		   }
		}
		for (i = 0;i < 4 && a[i][0] != 0;i++)
		{
			b = 0;
		  for (k = 0;k < 5 && a[i][0] != 0;k++)
		  {
			 c[k] = (a[i][0] % 10);
			 a[i][0] = a[i][0] / 10;
		  }
		  for (j = 0;j < k;j++)
		  {
			 t = Math.pow(10,(k - 1 - j));
			 f = (int)t;
			 b = b + f * c[j];
		  }
			System.out.printf("%ld\n",b);
		}
		   return 0;

	}

}

