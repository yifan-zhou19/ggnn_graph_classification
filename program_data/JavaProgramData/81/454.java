package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int check = new int(int b[5][5],int k);
	int i;
	int j;
	int k;
	int m;
	int n;
	int t;

	int[][] a = new int[5][5];
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
	if (check(a,n) == 1 && check(a,m) == 1)
	{
		for (i = 0;i < 5;i++)
		{
	  t = a[n][i];
	  a[n][i] = a[m][i];
	  a[m][i] = t;
		}
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			 System.out.printf("%d",a[i][j]);
		 if (j < 4)
		 {
			 System.out.print(" ");
		 }
		}
	System.out.print("\n");
	}
	}
	else
	{
	System.out.print("error");
	}
	}

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static check(int[][] b, int k)
	{
	int flag = 0;
	if (k >= 0 && k <= 4)
	{
	  flag = 1;
	}
	return (flag);

	}
}

