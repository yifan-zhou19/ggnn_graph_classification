package <missing>;

public class GlobalMembers
{
	public static int exchange(int[][] a, int n, int m)
	{
	 int i;
	 int temp;
	 if (n > 4 || m > 4 || n < 0 || m < 0)
	 {
	  return 0;
	 }
	 for (i = 0;i < 5;++i)
	 {
	  temp = a[n][i];
	  a[n][i] = a[m][i];
	  a[m][i] = temp;
	 }
	 return 1;
	}

	public static int Main()
	{
	int[][] a = new int[5][5];
	int n;
	int m;
	for (n = 0;n < 5;n++)
	{
	 for (m = 0;m < 5;m++)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[n][m] = Integer.parseInt(tempVar);
	  }
	 }
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	if (exchange(a, n, m) == 0)
	{
	 System.out.print("error\n");
	}
	else
	{
	 for (n = 0;n < 5;n++)
	 {
	  for (m = 0;m < 5;m++)
	  {
	   if (m == 4)
	   {
		System.out.printf("%d\n",a[n][m]);
	   }
	   else
	   {
		System.out.printf("%d ",a[n][m]);
	   }
	  }
	 }
	}
	}

}

