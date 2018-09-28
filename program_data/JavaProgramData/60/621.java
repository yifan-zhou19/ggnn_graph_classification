package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int m;
		  int n;
		  int i;
		  int j;
		  int k;
		  int[] a = new int[100000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n <= 4)
		  {
			  System.out.print("empty");
		  }
		  else
		  {
			  k = 0;
		  for (j = 3;j <= n;j++)
		  {
			  m = (int)Math.sqrt(j);
		  for (i = 2;i <= m;i++)
		  {
			 if (j % i == 0)
			 {
			 break;
			 }
		  }
		  if (i == m + 1)
		  {
			  a[k] = j;
		  k++;
		  }
		  }
		  for (k = 0;k < 10000;k++)
		  {
		  if (a[k] + 2 == a[k + 1])
		  {
		  System.out.printf("%d %d\n",a[k],a[k + 1]);
		  }
		  }
		  }
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

