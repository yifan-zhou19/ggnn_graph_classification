package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int c = 0;
		  int k;
		  int j;
		  int d;
		  int e;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[100000];
		  int[] b = new int[100000];
		  for (i = 0;i < 1000000;i++)
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
		  k = i - 1;
		  for (i = 0;i <= n - 1;i++)
		  {
			  d = 0;
			  e = 0;
			  for (j = 0;j <= k;j++)
			  {
				  if (b[j] == i)
				  {
				  d++;
				  }
			  }
			  for (j = 0;j <= k;j++)
			  {
				  if (a[j] == i)
				  {
				  e++;
				  }
			  }
			  if ((d == n - 1) && (e == 0))
			  {
					  System.out.printf("%d\n",i);
					  c++;
			  }
		  }
		  if (c == 0)
		  {
		  System.out.print("NOT FOUND\n");
		  }
	}
}

