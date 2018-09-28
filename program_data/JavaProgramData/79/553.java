package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[] a = new int[301];
		  int[] b = new int[301];
		  int i;
		  int j;
		  int n;
		  int m;
		  int c;
		  int x;
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
		  while (n != 0)
		  {
		  for (i = 1;i <= n;i++)
		  {
			  a[i] = i;
		  }
		  x = n;
		  for (i = 1;i < n;i++)
		  {
			  c = m % x;
			  if (c == 0)
			  {
				  c = x;
			  }
			  for (j = 1;j <= (x - c);j++)
			  {
				  b[j] = a[j + c];
			  }
			  for (j = 1;j <= c - 1;j++)
			  {
				  b[x - c + j] = a[j];
			  }
			  x = x - 1;
		  for (j = 1;j <= x;j++)
		  {
			  a[j] = b[j];
		  }

		  }
						   System.out.printf("%d\n",a[1]);
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  n = Integer.parseInt(tempVar3);
						  }
						  String tempVar4 = ConsoleInput.scanfRead(" ");
						  if (tempVar4 != null)
						  {
							  m = Integer.parseInt(tempVar4);
						  }
		  }

	}

}

