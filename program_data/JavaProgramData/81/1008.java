package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
	  if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
	  {
		  return (1);
	  }
	  else
	  {
		  return (0);
	  }
	}
	public static void Main()
	{
	  int[][] a = new int[5][5];
	  int[] b = new int[5];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  int * q;
	  int i;
	  int j;
	  int n;
	  int m;
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
	  if (f(n, m) == 0)
	  {
		  System.out.print("error");
	  }
	  else
	  {
		q = b;
		for (p = a[n];p < a[n] + 5;p++)
		{
		  *q = p;
		  q++;
		}
		q = a[n];
		for (p = a[m];p < a[m] + 5;p++)
		{
		  *q = p;
		  q++;
		}
		q = a[m];
		for (p = b;p < b + 5;p++)
		{
		  *q = p;
		  q++;
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


}

