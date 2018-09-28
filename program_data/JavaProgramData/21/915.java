package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int temp = 0;
		int n;
		int[] x = new int[301];
		int[] y = new int[301];
	 float ave = 0F;
	 float max = 0F;
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
			 x[i] = Integer.parseInt(tempVar2);
		 }
	 ave = x[i] + ave;
	 }
	 ave = ave / n;
	 for (i = 0;i < n;i++)
	 {
		 if (Math.abs(ave - x[i]) > max)
		 {
		   max = Math.abs(ave - x[i]);
		 }
	 }
	 for (i = 0,j = 0;i < n;i++)
	 {
		if (Math.abs(ave - x[i]) > max - 0.01)
		{
			y[j] = x[i];
			j++;
		}
	 }
	 k = j - 1;
	 for (i = 1;i <= n;i++)
	 {
		for (j = 0;j < k;j++)
		{
			 if (y[j] > y[j + 1])
			 {
				temp = y[j];
			 y[j] = y[j + 1];
			 y[j + 1] = temp;
			 }
		}
	 }
		System.out.printf("%d",y[0]);
	 for (i = 1;i <= k;i++)
	 {
		 System.out.printf(",%d",y[i]);
	 }
	return 0;

	}


}

