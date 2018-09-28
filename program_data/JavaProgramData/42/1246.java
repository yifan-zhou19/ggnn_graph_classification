package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[100000];
		  int b;
		  int c;
		  int m;
		  int n;
		  int i;
		  int t;
		  int j;
		  int e = 0;
		  int p;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  p = n;
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
			  m = Integer.parseInt(tempVar3);
		  }
		  for (c = 0;c < n;c++)
		  {
			  if (a[c] == m)
			  {
				  e++;
			  }
		  }

		  for (c = 0;c <= e;c++)
		  {
			  for (i = 0;i < n - 1;i++)
			  {
			  if (a[i] == m)
			  {
				   a[i] = a[i + 1];
				   a[i + 1] = m;
			  }
			  }
		  }
		  if (n - e-1 > 0)
		  {
			  for (i = 0;i < n - e-1;i++)
			  {
			  System.out.printf("%d ",a[i]);
			  }
		  System.out.printf("%d",a[n - e-1]);
		  }
		  if (n - e-1 == 0)
		  {
			  System.out.printf("%d",a[n - e-1]);
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

