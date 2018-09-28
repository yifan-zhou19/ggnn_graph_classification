package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int reverse = int num;
	   for (i = 1;i <= 6;i++)
	   {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 System.out.printf("%d\n",reverse(n));
	   }
	   return (0);
	}

	public static int reverse(int num)
	{
	  int s;
	  int num1;
	  if (num > 0)
	  {
		  num1 = num;
	  }
	  else
	  {
		  num1 = -num;
	  }
	  s = 0;
	  while (num1 > 0)
	  {
		s = s * 10 + num1 % 10;
		num1 = num1 / 10;
	  }
	  if (num < 0)
	  {
		  s = -s;
	  }
	  return (s);
	}
}

