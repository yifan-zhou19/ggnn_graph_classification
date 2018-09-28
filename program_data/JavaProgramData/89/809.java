package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int[] a = new int[20000];
		  int[] b = new int[20000];
		  for (k = 0;k < 20000;k++)
		  {
			 a[k] = 0;
			 b[k] = 0;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  i = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  j = Integer.parseInt(tempVar3);
		  }
		  while ((i + j) != 0)
		  {
			   a[i]++;
			   b[j]++;
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   i = Integer.parseInt(tempVar4);
			   }
			   String tempVar5 = ConsoleInput.scanfRead(" ");
			   if (tempVar5 != null)
			   {
				   j = Integer.parseInt(tempVar5);
			   }
		  }
		  for (k = 0;k <= n - 1;k++)
		  {
			 if (b[k] == n - 1 && a[k] == 0)
			 {
				 j = 0;
				 break;
			 }
		  }
		  if (j != 0)
		  {
		  System.out.print("NOT FOUND");
		  }
		  else
		  {
		  System.out.printf("%d",k);
		  }
	}
}

