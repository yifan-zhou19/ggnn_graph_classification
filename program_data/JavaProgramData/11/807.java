package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
	if (x % 4 != 0)
	{
	return 0;
	}
	else if ((x % 100 == 0) && (x % 400 != 0))
	{
	return 0;
	}
	else
	{
	return 1;
	}
	}
	public static int Main()
	{
		  int y;
		  int m;
		  int d;
		  int j = 1;
		  int n = 0;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  y = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  d = Integer.parseInt(tempVar3);
		  }
		  int[] a = new int[13];
		  a[1] = 31;
		  if (f(y) == 0)
		  {
		  a[2] = 28;
		  }
		  else
		  {
		  a[2] = 29;
		  }
		  a[3] = 31;
		  a[4] = 30;
		  a[5] = 31;
		  a[6] = 30;
		  a[7] = 31;
		  a[8] = 31;
		  a[9] = 30;
		  a[10] = 31;
		  a[11] = 30;
		  a[12] = 31;
		  for (j = 1;j < m;j++)
		  {
		  n = n + a[j];
		  }
		  n = n + d;
		  System.out.printf("%d\n",n);
	}

}

