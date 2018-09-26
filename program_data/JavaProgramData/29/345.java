package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int m;
		  int max = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[m];
		  for (i = 0;i < m;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Integer.parseInt(tempVar2);
			  }
			  if (a[i] > max)
			  {
			  max = a[i];
			  }
		  }
		  int[] b = new int[max + 1];
		  float sum;
		  b[0] = 1;
		  b[1] = 2;
		  for (i = 2;i <= max;i++)
		  {
			  b[i] = b[i - 1] + b[i - 2];
		  }
		  for (i = 0;i < m;i++)
		  {
			  sum = 0F;
			  for (int j = 0;j < a[i];j++)
			  {
				  sum += (float)b[j + 1] / b[j];
			  }
			  System.out.printf("%.3f\n",sum);
		  }
	}

}

