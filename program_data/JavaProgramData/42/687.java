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
		  for (i = 0;i < n;i++)
		  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
		  }
		  int k;
		  int j;
		  int t;
		  int f = 0;
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  k = Integer.parseInt(tempVar3);
		  }
		  j = n;
		  i = 0;
		  while (i < n)
		  {
			  i++;
			  if (a[f] == k)
			  {
				  j--;
				  for (t = f;t <= j;t++)
				  {
					a[t] = a[t + 1];
				  }
			  }
			  else
			  {
				  f++;
			  }
		  }
		  System.out.printf("%d",a[0]);
		  for (i = 1;i < j;i++)
		  {
		   System.out.printf(" %d",a[i]);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

