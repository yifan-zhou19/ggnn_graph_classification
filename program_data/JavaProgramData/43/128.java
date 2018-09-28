package <missing>;

public class GlobalMembers
{
	public static int ss(int a)
	{
		  int i = 2;
		  int k = 0;
		  for (i = 2;i <= (a / 2);i++)
		  {
			  if ((a % i) == 0)
			  {
				  k++;
			  }
		  }
		  return k;
	}

	public static int Main()
	{
		  int m;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		  int a;
		  int b;
		  int i;
		  int j;
		  for (a = 3;a <= m / 2;a++)
		  {
			  i = ss(a);
			  if (i == 0)
			  {
				  b = m - a;
				  j = ss(b);
				  if (j == 0)
				  {
				  System.out.printf("%d %d\n",a,b);
				  }
			  }
		  }
		  return 0;
	}

}

