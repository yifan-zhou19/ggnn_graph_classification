package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int e;
	 int k = 0;
	 int n;
	 int[] b = new int[500];
	 int[] a = new int[500];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	 }
	  for (int i = 0;i < n;i++)
	  {
		 if (a[i] % 2 != 0)
		 {
		   b[k] = a[i];
		   k++;
		 }
	  }
	  for (int c = 1;c <= k;c++)
	  {
		 for (int g = 0;g < k - c;g++)
		 {
			if (b[g] > b[g + 1])
			{
			   e = b[g + 1];
			   b[g + 1] = b[g];
			   b[g] = e;
			}
		 }
	  }
	  System.out.printf("%d",b[0]);
	for (int g = 1;g < k;g++)
	{
	  System.out.printf(",%d",b[g]);
	}
	return 0;
	}
}

