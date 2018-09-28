package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[][] a = new int[5][5];
	int i;
	int j;
	int k;
	int m;
	int n;
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
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	int change = new int(int m,int n);
	   if (change(m, n) != 0)
	   {
			for (i = 0;i < 5;i++)
			{
			 k = a[m][i];
			 a[m][i] = a[n][i];
			 a[n][i] = k;
			}
		 for (i = 0;i < 5;i++)
		 {
			 for (j = 0;j < 4;j++)
			 {
			 System.out.printf("%d ",a[i][j]);
			 }
			 System.out.printf("%d",a[i][4]);
			 System.out.print("\n");
		 }
	   }
	   else
	   {
		   System.out.print("error");
	   }
	}

	public static int change(int m,int n)
	{
		if (m < 5 && n < 5)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

