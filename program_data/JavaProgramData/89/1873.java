package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  int h;
			  int v;
			  int j;
			  int z;
			  int i;
			  int n;
			  int p;
			  int q;
			  int u;
			  int[] a = new int[100000];
			  int[] b = new int[100000];
			  int[] c = new int[10000];
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  for (i = 0;;i++)
			  {
					  String tempVar2 = ConsoleInput.scanfRead();
					  if (tempVar2 != null)
					  {
						  p = Integer.parseInt(tempVar2);
					  }
					  String tempVar3 = ConsoleInput.scanfRead(" ");
					  if (tempVar3 != null)
					  {
						  q = Integer.parseInt(tempVar3);
					  }
					  a[i] = p;
					  b[i] = q;
					  if (p == 0 && q == 0)
					  {
						  v = i;
						  break;
					  }
			  }
				   for (j = 0;j <= v - 1;j++)
				   {
					   c[a[j]]--;
					   c[b[j]]++;
				   }
				   for (j = 0;j <= n - 1;j++)
				   {

					 if (c[j] == n - 1)
					 {
						 u = 1;
						 h = j;
					 }
				   }
				   if (u == 1)
				   {
					   System.out.printf("%d",h);
				   }
				   else
				   {
					   System.out.print("NOT FOUND");
				   }

	}

}

