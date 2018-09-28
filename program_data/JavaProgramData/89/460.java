package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int[] a = new int[100000];
	   int[] b = new int[100000];
	   int i;
	   int j;
	   int m;
	   int s;
	   int k;
	   int p;
	   int v;
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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  if (a[i] == 0 && b[i] == 0)
		  {
			  break;
		  }
	   }
		  i = i - 1;
		  v = 0;
	   for (j = 0;j <= i;j++)
	   {
						m = b[j];
						s = 0;
						for (k = 0;k <= i;k++)
						{
										 if (b[k] == m)
										 {
										 s = s + 1;
										 }
						}
						if (s == n - 1)
						{
								  for (p = 0;p <= i;p++)
								  {
												   if (a[p] == m)
												   {
													   break;
												   }
								  }
								  if (p == i + 1)
								  {
									v = 1;
									System.out.printf("%d",m);
									break;
								  }
						}
	   }
	   if (v == 0)
	   {
	   System.out.print("NOT FOUND");
	   }
	   System.in.read();
	   System.in.read();
	}

}

