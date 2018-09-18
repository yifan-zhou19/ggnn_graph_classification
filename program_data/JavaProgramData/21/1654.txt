package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n;
	  int n;
	  int j;
	  int[] a = new int[N];
	  int[] c = new int[N];
	  int i;
	  int temp;
	  int k = 0;
	  float ave;
	  float sum = 0F;
	  float[] b = new float[N];
	  float d = 0F;
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
	  sum = sum + a[i];
	  }
	  for (i = 0;i < n - 1;i++)
	  {
	  for (j = 0;j < n - i - 1;j++)
	  {
	  if (a[j] > a[j + 1])
	  {
		   temp = a[j];
		   a[j] = a[j + 1];
		   a[j + 1] = temp;
	  }
	  }
	  }
	  ave = sum / n;
	  for (i = 0;i < n;i++)
	  {
	   b[i] = Math.abs(a[i] - ave);
	   if (b[i] > d)
	   {
		d = b[i];
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
	  if (b[i] == d)
	  {
	  c[k] = a[i];
	  k++;
	  }
	  }
		System.out.printf("%d",c[0]);
		if (k > 1)
		{
		for (i = 1;i < k;i++)
		{
		System.out.printf(",%d",c[i]);
		}
		}
		return 0;
	}
}

