package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a = 0;
	  int b = 0;
	  int i;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  if (n % 10 != 0)
	  {
			 a = n % 10;
			 n = n / 10;
	  }
	  for (i = 0;i < 4;i++)
	  {
		 if (n % 10 != 0)
		 {
			 b = n % 10;
			 a = a * 10 + b;
			 n = n / 10;
		 }
	  }
	  System.out.printf("%d\n", a);
	  return 0;
	}
}

