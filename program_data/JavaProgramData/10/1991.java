package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int max;
		  int num = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] b = new int[n];
		  for (i = 0;i < n;i++)
		  {
		  b[i] = 0;
		  }
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  }
		  b[n - 1] = 1;
		  for (i = n - 2;i >= 0;i--)
		  {
			  max = b[i];
		   for (j = i + 1;j < n;j++)
		   {
			   if ((a[i] >= a[j]) && (b[j] >= max))
			   {
			max = b[j];
			   }
		   }
		   b[i] = max + 1;
		  }
		   for (i = 0;i < n;i++)
		   {
		   if (b[i] > num)
		   {
		   num = b[i];
		   }
		   }
		   System.out.printf("%d\n",num);

	}

}

