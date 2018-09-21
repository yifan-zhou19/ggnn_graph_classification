package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int[] a = new int[305];
	int sum;
	int z;
	int aver;
	int x = 0;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0,sum = 0;i < n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		 sum += a[i];
	}
	aver = (sum + n - 2) / n;
	for (i = 0;i < n;i++)
	{
		 y = a[i] - aver;
	 if (y < 0)
	 {
		 y = 0 - y;
	 }
	 if (x < y)
	 {
		 x = y;
	 }
	}
	for (i = 0;;i++)
	{
	  y = a[i] - aver;
	  if (y == x || y == 0 - x)
	  {
		  System.out.printf("%d",a[i]),z = i;
		  break;
	  }
	  else
	  {
		  continue;
	  }
	}
	for (i = z + 1;i < n;i++)
	{
	 y = a[i] - aver;
	 if (y == x || y == 0 - x)
	 {
		 System.out.printf(",%d",a[i]);
	 }
	}
	}


}

