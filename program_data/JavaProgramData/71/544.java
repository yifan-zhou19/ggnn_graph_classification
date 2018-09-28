package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] a = new int[n];
		  int[] b = new int[n];
		  int[] c = new int[n];
		  for (i = 0;i < n;i++)
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
						  String tempVar4 = ConsoleInput.scanfRead(" ");
						  if (tempVar4 != null)
						  {
							  c[i] = Integer.parseInt(tempVar4);
						  }
		  }
		  int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		   int p;
		   int q;
		  int s;
		  for (i = 0;i < n;i++)
		  {
						  if ((a[i] % 4 == 0 && a[i] % 100 != 0) || a[i] % 400 == 0)
						  {
									   d[1] = 29;
						  }

						  p = b[i];
						  q = c[i];
						  if (p > q)
						  {
								 int temp;
								 temp = p;
								 p = q;
								 q = temp;
						  }
						  int s = 0;
						  for (j = p;j < q;j++)
						  {
										  s = d[j - 1] + s;
						  }
						  if (s % 7 == 0)
						  {
						  System.out.print("YES\n");
						  }
						  else
						  {
						  System.out.print("NO\n");
						  }
						  d[1] = 28;
		  }

	}

}

