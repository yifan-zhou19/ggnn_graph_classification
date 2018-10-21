package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int f = new int(int b[5][5],int n,int m);
	int[][] a = new int[5][5];
	int i;
	int j;
	int k;
	int m;
	int n;
	int t;
	for (i = 0;i < 5;i++)
	{
	  for (j = 0;j < 5;j++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
	  }
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	k = f(a,n,m);
	if (k == 0)
	{
	  System.out.print("error");
	}
	if (k == 1)
	{
		for (j = 0;j < 5;j++)
		{
			 t = a[n][j];
		  a[n][j] = a[m][j];
		  a[m][j] = t;
		}
	  for (i = 0;i < 5;i++)
	  {
		  for (j = 0;j < 4;j++)
		  {
			  System.out.printf("%d ",a[i][j]);
		  }
		  System.out.printf("%d\n",a[i][4]);
	  }
	}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static f(int[][] b, int n, int m)
	{
	int i;
	int j;
	int k;
	int e;
	int f;
	e = 0;
	f = 0;
	for (i = 0;i < 5;i++)
	{
	  for (j = 0;j < 5;j++)
	  {
		  if (b[i][j] == n)
		  {
			  e = 1;
		  break;
		  }
	  }
	}
	for (i = 0;i < 5;i++)
	{
	  for (j = 0;j < 5;j++)
	  {
		  if (b[i][j] == m)
		  {
			  f = 1;
		  break;
		  }
	  }
	}
	if (e == 1 && f == 1 && n < 5 && m < 5)
	{
	   k = 1;
	}
	else
	{
		k = 0;
	}
	return (k);


	}
}

