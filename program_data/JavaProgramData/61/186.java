package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int i;
	  int k;
	  int n;
	  int m;
	  a = 1;
	  b = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] u = new int[n];
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
	  if (m <= 2)
	  {
		  c = 1;
	  }
	  else
	  {
		  a = 1;
	  }
	  b = 1;
	  for (k = 3;k <= m;k++)
	  {
		  c = a + b;
		  a = b;
		   b = c;
	  }
	   u[i] = c;
	  }
	  for (i = 1;i <= n;i++)
	  {
		  System.out.printf("%d\n",u[i]);
	  }

	  return 0;
	}

}

