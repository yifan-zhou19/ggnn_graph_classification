package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int k;
		  int l;
		  int d = 1;
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  int[] c = new int[100000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		  c[i] = 0;
		  }
		  for (i = 1;;i++)
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
		  l = a[i];
		  k = b[i];
		  c[l] = -1;
		  if (c[k] >= 0)
		  {
		  c[k] = c[k] + 1;
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  if (c[i] == n - 1)
		  {
					 System.out.printf("%d\n",i);
					 d = 0;
					break;
		  }
		  }
		  if (d == 1)
		  {
		  System.out.print("NOT FOUND\n");
		  }
	}

}

