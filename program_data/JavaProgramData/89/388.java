package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int m;
		  int f;
		  int k = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] b = new int[n];
		  for (int i = 0;i < n;i++)
		  {
			  a[i] = 0;
		  b[i] = 0;
		  }
		  for (int i = 0;;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  m = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  f = Integer.parseInt(tempVar3);
			  }
		  if (m == 0 && f == 0)
		  {
			  break;
		  }
		  a[m]++;
		  b[f]++;
		  }
		  for (int i = 0;i < n;i++)
		  {
		  if (a[i] == 0 && b[i] == n - 1)
		  {
		  System.out.printf("%d\n",i);
		  k++;
		  }
		  }
		  if (k == 0)
		  {
			  System.out.print("NOT FOUND\n");
		  }
		  System.in.read();
		  System.in.read();
	}

}

