package <missing>;

public class GlobalMembers
{
	public static int RevNum(int n)
	{
		int s = 0;
		if (n >= 0)
		{
		 while (n / 10 != 0)
		 {
		  s = n % 10;
		  n = n / 10;
		  System.out.printf("%d",s);
		 }
		 System.out.printf("%d\n",n);
		}
		else
		{
		 n = Math.abs(n);
		 System.out.print("-");
		 while (n / 10 != 0)
		 {
		  s = n % 10;
		  n = n / 10;
		  System.out.printf("%d",s);
		 }
		 System.out.printf("%d\n",n);
		}
	}
	public static int Main()
	{
		int i = 0;
	  int k;
	  while (i < 6)
	  {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }
	  while (k % 10 == 0)
	  {
		k = k / 10;
	  }
	  RevNum(k);
	  i++;
	  }

	}

}

