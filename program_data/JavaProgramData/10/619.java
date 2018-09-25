package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int i;
		  int j;
		  int max = 0;
		  for (i = 0;i < n;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
		  }
		  int[] b = new int[n];
		  for (i = 0;i < n;i++)
		  {
			b[i] = 1;
		  }
		  b[n - 1] = 1;
		  for (i = n - 2;i >= 0;i--)
		  {
				for (j = i + 1;j < n;j++)
				{
				   if (a[j] <= a[i] != 0 && b[j] + 1 >= b[i])
				   {
				   b[i] = b[j] + 1;
				   }
				}
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (b[i] > max)
			  {
			  max = b[i];
			  }
		  }
		  System.out.printf("%d",max);
	}
}

