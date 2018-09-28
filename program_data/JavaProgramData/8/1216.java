package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
		  return ((int)elem1) - ((int) elem2);
	}
	public static int Main()
	{
		  int n;
		  int m;
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
		  int[] a = new int[n];
		  int[] b = new int[m];
		  int i;
		  int j;
		  for (i = 0;i < n;i++)
		  {
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i] = Integer.parseInt(tempVar3);
					}
		  }
		  for (i = 0;i < m;i++)
		  {
					 String tempVar4 = ConsoleInput.scanfRead();
					 if (tempVar4 != null)
					 {
						 b[i] = Integer.parseInt(tempVar4);
					 }
		  }
		  qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
		  qsort(b,m,(Integer.SIZE / Byte.SIZE),compare);
		  int[] c = new int[n + m];
		  for (i = 0;i < n;i++)
		  {
							c[i] = a[i];
		  }
		  for (i = n,j = 0;i < m + n;i++,j++)
		  {
						  c[i] = b[j];
		  }
		  for (i = 0;i < n + m - 1;i++)
		  {

							System.out.printf("%d ",c[i]);
		  }
							System.out.printf("%d\n",c[i]);

	}

}

