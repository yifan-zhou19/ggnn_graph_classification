package <missing>;

public class GlobalMembers
{
	public static int m = 0;
	public static int n = 0;
	public static int i = 0;
	public static int k = 0;
	public static int e = 0;
	public static int t = 0;
	public static int[][] a = new int[1000][1000];
	public static int[] b = new int[1000];
	public static int Main()
	{

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
		 for (k = 0;k < m;k++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][k] = Integer.parseInt(tempVar3);
			 }
		 }
	}



	e = n;
	for (i = 0;i < n;i++)
	{
		 t = 0;
		 for (k = 0;k < m;k++)
		 {

			 if (a[i][k] > t)
			 {
				 t = a[i][k];
				 b[i] = k;
			 }
		 }

	}
	for (i = 0;i < n;i++)
	{
		 for (k = 0;k < n;k++)
		 {
			  if (a[i][b[i]] > a[k][b[i]])
			  {
				  b[i] = 9999;
				  e--;
				  break;
			  }

		 }
	}


	for (i = 0;i < n;i++)
	{
		  if (b[i] != 9999)
		  {
				 System.out.printf("%d+%d\n",i,b[i]);
		  }

	}
		  if (e == 0)
		  {
			  System.out.print("No");
		  }
	return 0;
	}
}

