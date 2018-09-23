package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[300];
	  int j;
	  int i;
	  int sum = 0;
	  int temp;
	  float b;
	  float[] c = new float[300];
	  float min;
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
			sum += a[i];
	  }
	  b = (float)sum / n;
	  //printf("%f\n",b);??
	  for (i = 0;i < n;i++)
	  {
			if (a[i] > b)
			{
			c[i] = a[i] - b;
			}
			else
			{
			c[i] = b - a[i];
			}
		   // printf("%f\n",c[i]);
	  }
	  for (i = 1;i < n;i++)
	  {
			for (j = n - 1;j >= i;j--)
			{
				if (c[j - 1] > c[j])
				{
				 min = c[j];
				  c[j] = c[j - 1];
				  c[j - 1] = min;
				  temp = a[j];
				  a[j] = a[j - 1];
				  a[j - 1] = temp;
				}
			}
	  }
	  if (c[n - 1] == c[n - 2])
	  {


		 if (a[n - 2] > a[n - 1])
		 {
			 temp = a[n - 1];
			 a[n - 1] = a[n - 2];
			 a[n - 2] = temp;
		 }


		 System.out.printf("%d,%d",a[n - 2],a[n - 1]);


	  }
	  else
	  {
	  System.out.printf("%d",a[n - 1]);
	  }
	  return 0;

	}

}

