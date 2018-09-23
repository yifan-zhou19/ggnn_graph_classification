package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  char g;
		  int c;
		  int d;
		  int f;
		  int[] a = new int[25];
		  int[] b = new int[25];
		  int k;
		  int[] e = new int[25];
		  e[0] = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  for (c = 0; ;c++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[c] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar3 != null)
		  {
			  g = tempVar3.charAt(0);
		  }
		  if (g != ' ')
		  {
		  break;
		  }
		  else
		  {
			  ;
		  }
		  }
		  for (c = 0;c <= k - 1;c++)
		  {
			  b[c] = a[k - 1 - c];
		  }

		  for (c = 1;c <= k - 1;c++)
		  {
			  for (d = 0,e[c] = 0;d <= c - 1;d++)
			  {
			   if (b[c] >= b[d] != 0 && e[c] <= e[d])
			   {
			   e[c] = e[d];
			   }
			   else
			   {
				   ;
			   }
			  }
			  e[c]++;
		  }
		 // for (c=0;c<=k-1;c++)
		 // {
		 // printf("%d ",e[c]);
		 // }
	 for (c = 0,f = e[0];c <= k - 1;c++)
	 {
		  if (f <= e[c])
		  {
		  f = e[c];
		  }
		  else
		  {
			  ;
		  }
	 }
		  System.out.printf("%d",f);
	}

}

