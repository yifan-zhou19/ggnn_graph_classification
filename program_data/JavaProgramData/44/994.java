package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
	  int c = 0;
	  while (a != 0)
	  {
		   c = c * 10 + a % 10;
		   a = a / 10;
	  }
	  return c;
	}

	public static int Main()
	{
	  int a;
	  int i;
	  for (i = 0;i < 6;i++)
	  {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 System.out.printf("%d\n",reverse(a));
	  }

	}
}

