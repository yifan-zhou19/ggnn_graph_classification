package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[100];
	int j;
	int t;
	int[] c = new int[100];
	int s = 0;
	float max;
	float m;
	float[] b = new float[100];
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
	  s = s + a[i];
	 }
	 for (i = 0;i < n;i++)
	 {
	  for (j = n - 1;j > i;j--)
	  {
	   if (a[j] < a[j - 1])
	   {
		t = a[j - 1];
		a[j - 1] = a[j];
		a[j] = t;
	   }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  m = (float)s / n;
	  b[i] = a[i] - m;
	  if (b[i] < 0.0F)
	  {
	   b[i] = -b[i];
	  }

	 }
	 max = 0.0F;
	 for (i = 0;i < n;i++)
	 {
	  if (b[i] >= max)
	  {
	   max = b[i];


	  }

	 }
	 j = 0;
	 for (i = 0;i < n;i++)
	 {
		 if (b[i] == max)
		 {
		 c[j] = a[i];
	   j++;
		 }
	 }

	 System.out.printf("%d",c[0]);


	 for (i = 1;i < j;i++)
	 {
	System.out.printf(",%d",c[i]);

	 }

	  return 0;
	}

}

