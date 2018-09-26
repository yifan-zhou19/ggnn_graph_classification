package <missing>;

public class GlobalMembers
{
	public static void paixu(int[] p, int k)
	{
		 int i;
		 int j;
		 int t;
		 for (i = 0;i < k - 1;i++)
		 {
			  for (j = 0;j < k - 1 - i;j++)
			  {
					if (p[j] < p[j + 1])
					{
						   t = p[j];
						   p[j] = p[j + 1];
						   p[j + 1] = t;
					}
			  }
		 }
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int saima(tangible.RefObject<int> p, tangible.RefObject<int> q, int k);
	public static int Main()
	{
		  int[] tian = new int[2020];
		  int[] qi = new int[1010];
		  int n;
		  int i;
		  int j;
		  int k;
		  int m;
		  int max;
		  for (;;)
		  {
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 n = Integer.parseInt(tempVar);
				 }
				 if (n != 0)
				 {
						 for (i = 0;i < n;i++)
						 {
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 tian[i] = Integer.parseInt(tempVar2);
						 }
						 }
						 for (j = 0;j < n;j++)
						 {
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 qi[j] = Integer.parseInt(tempVar3);
						 }
						 }
						 paixu(tian, n);
						 paixu(qi, n);
						 max = -n;
						 for (k = 0;k < n;k++)
						 {
						 tian[n + k] = tian[k];
						 }
						 for (i = 0;i < n;i++)
						 {
							  m = 0;
							  for (j = 0;j < n;j++)
							  {
									if (tian[j + i] > qi[j])
									{
									m = m + 1;
									}
									if (tian[j + i] < qi[j])
									{
									m = m - 1;
									}
							  }
							  if (m > max)
							  {
							  max = m;
							  }
						 }
						 System.out.printf("%d\n",200 * max);
				 }
				 else
				 {
				 break;
				 }
		  }

	}

}

