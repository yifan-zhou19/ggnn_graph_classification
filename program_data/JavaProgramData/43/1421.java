package <missing>;

public class GlobalMembers
{
	public static int sushu(int m)
	{
		int i;
	  for (i = 2;i <= m;i++)
	  {
	  if (m % i == 0)
	  {
		  break;
	  }
	  }
	  if (i < m)
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
		int n;
		int a;
		int b;
		int x;
		int y;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   a = 3;
	   b = n - a;
	   while (a <= b)
	   {
		   x = sushu(a);
		 y = sushu(b);
		 if (x == 1 && y == 1)
		 {
			 System.out.printf("%d %d\n",a,b);
			 a = a + 2;
			 b = b - 2;
		 }
	   else
	   {
		   a = a + 2;
		   b = b - 2;
	   }
	   }
	}
}

