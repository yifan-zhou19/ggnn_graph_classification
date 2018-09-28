package <missing>;

public class GlobalMembers
{
	public static int sushu(int c)
	{
			  int a;
			  for (a = 2;a <= c - 1;a++)
			  {
			  if (c % a == 0)
			  {
			  return (0);
			  continue;
			  }
			  if (a == c - 1 && c % a != 0)
			  {
			  return (1);
			  }
			  }
	}
	public static int Main()
	{
		  int n;
		  int b;
		  int d = 3;
		  int e;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty\n");
		  }
		  else
		  {
			  for (b = 5;b <= n;b = b + 2)
			  {
				  if (sushu(b) == 1)
				  {
				  e = b;
				  if (e - d == 2)
				  {
				  System.out.printf("%d %d\n",d,e);
				  }
				  d = e;
				  }
			  }
		  }
		  return 0;
	}
}

