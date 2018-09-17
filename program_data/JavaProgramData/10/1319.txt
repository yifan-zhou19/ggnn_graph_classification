package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		  if (x >= y)
		  {
		  return x;
		  }
		  else
		  {
		  return y;
		  }
	}

	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int[] p = new int[25];
		  int result;
		  int[] a = new int[25];
		  int[] b = new int[25];
		  int sum;
		  for (i = 0;i < 25;i++)
		  {
			  a[i] = b[i] = p[i] = 0;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < k;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  p[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  b[k - 1] = 1;
		  for (i = k - 2;i >= 0;i--)
		  {
							 sum = 0;
							 for (int m = 0;m < 25;m++)
							 {
								 a[m] = 0;
							 }
							 for (j = k - 1;j > i;j--)
							 {
												if (p[j] <= p[i])
												{
													a[j] = b[j];
												}
												sum = max(sum, a[j]);
							 }
							 b[i] = sum + 1;
		  }
		  result = 0;
		  for (i = 0;i < k;i++)
		  {
			  result = max(result, b[i]);
		  }
		  System.out.printf("%d",result);

	}

}

