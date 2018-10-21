package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  int m = 0;
		  int l = 0;
		  int p = 0;
		  int q = 0;
		  int[][] a = new int[100000][2];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[0][0] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  a[0][1] = Integer.parseInt(tempVar3);
		  }
		  while (a[m][0] > 0 || a[m][1] > 0) //??m?
		  {
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a[m + 1][0] = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					a[m + 1][1] = Integer.parseInt(tempVar5);
				}
				m++;
		  }
		  for (i = 0;i < n;i++)
		  {
			  l = 0;
			  for (j = 0;j < m;j++) //??????i
			  {
				  if (a[j][1] == i)
				  {
				  l++;
				  }
			  }
			  if (l == n - 1)
			  {
						 p = 0;
						 for (j = 0;j < m;j++) //i??????
						 {
							 if (a[j][0] == i)
							 {
							 p++;
							 }
						 }
						 if (p == 0)
						 {
								  System.out.printf("%d\n",i);
								  q++;
						 }
			  }
		  }
		  if (q == 0)
		  {
		  System.out.print("NOT FOUND\n");
		  }
		  System.in.read();
		  System.in.read();
	}
}

