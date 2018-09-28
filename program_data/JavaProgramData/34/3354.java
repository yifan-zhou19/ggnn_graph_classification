package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	  int print = int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n != 1)
	  {
		  print(n);
	  }
	  System.out.print("End");
	}
	public static int print(int n)
	{
		int a;
		int b;
	  if (n % 2 == 0)
	  {
		  a = (n / 2);
		  System.out.printf("%d/2=%d\n",n,a);
	  }
		 else
		 {
			 a = (n * 3 + 1);
			 System.out.printf("%d*3+1=%d\n",n,a);
		 }
	  if (a != 1)
	  {
		  b = print(a);
	  }
	return (0);
	}
}

