package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int k;
		  int i;
		  int x;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  k = Integer.parseInt(tempVar);
		  }
		  int[] h = new int[k];
		  int[] a = new int[k];
		  for (i = 0;i < k;i++)
		  {
						   String tempVar2 = ConsoleInput.scanfRead();
						   if (tempVar2 != null)
						   {
							   h[i] = Integer.parseInt(tempVar2);
						   }
		  }
		  for (x = 0;x < k;x++)
		  {
						  a[x] = 1;
		  }
		  int c;
		  int d;
		  for (c = k - 2;c >= 0;c--)
		  {
							 for (d = c + 1;d < k;d++)
							 {

											   if ((h[c] >= h[d]) && (a[d] >= a[c]))
											   {
											   a[c] = a[d] + 1;
											   }
							 }
		  }
		  int y = 1;
		  int m;
		  for (m = 0;m < k;m++)
		  {
						  if (a[m] > y)
						  {
						  y = a[m];
						  }
		  }
		  System.out.printf("%d",y);

		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();

	}

}

