package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int j;
		  int i;
		  int k;
		  int c = 0;
		  int[] b = new int[1000];
		  int[] a = new int[1000];
		  for (c = 0;;c++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  if (m == 0 && n == 0)
		  {
		  break;
		  }
		  else if (n == 1)
		  {
		  b[c] = n;
		  }
		  else
		  {
		  for (i = 0;i <= n - 1;i++)
		  {
		  a[i] = i + 1;
		  }
		  j = 0;
		  for (i = 1;i <= n - 1;i++)
		  {
		  j = (j + m - 1) % (n - i + 1);
		  for (k = 0;k < n - i;k++)
		  {
			  if (k < j)
			  {
			  a[k] = a[k];
			  }
			  else
			  {
			  a[k] = a[k + 1];
			  }
		  }
		  b[c] = a[0];
		  }
		  }
		  }
		  for (i = 0;i < c;i++)
		  {
			  if (i == 0)
			  {
		  System.out.printf("%d",b[i]);
			  }
		  else
		  {
		  System.out.printf("\n%d",b[i]);
		  }
		  }

		  System.in.read();
		  System.in.read();
			return 0;
	}




}

