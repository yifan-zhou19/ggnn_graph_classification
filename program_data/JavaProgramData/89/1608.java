package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[20001];
		  int[] b = new int[20001];
		  int i;
		  int j;
		  int k;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  k = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  j = Integer.parseInt(tempVar3);
		  }
		  for (i = 0;i <= n;i++)
		  {
						   a[i] = 0;
						   b[i] = 0;
		  }
		  while (k > 0 || j > 0)
		  {
			   a[k]++;
			   b[j]++;
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   k = Integer.parseInt(tempVar4);
			   }
			   String tempVar5 = ConsoleInput.scanfRead();
			   if (tempVar5 != null)
			   {
				   j = Integer.parseInt(tempVar5);
			   }
		  }
		  j = 0;
		  for (i = 0;i <= n - 1;i++)
		  {
			 if (a[i] == 0 && b[i] > 0)
			 {
			  k = i;
			  j = 1;
			 }
		  }
		  if (j != 0)
		  {
			  System.out.printf("%d\n",k);
		  }
		  else
		  {
			  System.out.print("NOT FOUND\n");
		  }
	}


}

