package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int k;
		  int[] mark = new int[n];
		  for (i = 0;i < n;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i] = Integer.parseInt(tempVar2);
			 }
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  k = Integer.parseInt(tempVar3);
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (k != a[i])
						  {
								  mark[j] = a[i];
								  j++;
						  }
		  }
		  for (i = 0;i < j - 1;i++)
		  {
			 System.out.printf("%ld ",mark[i]);
		  }
		  System.out.printf("%ld",mark[j - 1]);
	}
}

