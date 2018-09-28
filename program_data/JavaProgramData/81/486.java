package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'a', so pointers on this parameter are left unchanged:
	public static void input(int * a)
	{
	  int i;
	  int j;
	  for (i = 0;i < 5;i++)
	  {
		  for (j = 0;j < 5;j++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a++ = Integer.parseInt(tempVar);
			  }
		  }
	  }
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'a', so pointers on this parameter are left unchanged:
	public static void output(int * a)
	{
	  int i;
	  int j;
	  for (i = 0;i < 5;i++)
	  {
		  for (j = 0;j < 4;j++)
		  {
			  System.out.printf("%d ",*a++);
		  }
		  System.out.printf("%d\n",*a++);
	  }
	}

	public static int inv(int[] a, int n, int m)
	{
	  int z;
	  int t;
	  int i;
	  if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
	  {
		  for (i = 0;i < 5;i++)
		  {
			t = a[n][i];
			a[n][i] = a[m][i];
			a[m][i] = t;
		  }
			 z = 1;
	  }
	  else
	  {
		  z = 0;
	  }
	  return z;
	}

	public static int Main()
	{
	  int[][] a = new int[5][5];
	  int n;
	  int m;
	  input(a[0]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  if (inv(a, n, m) == 0)
	  {
		  System.out.print("error");
	  }
	  else
	  {
		  output(a[0]);
	  }
	}
}

