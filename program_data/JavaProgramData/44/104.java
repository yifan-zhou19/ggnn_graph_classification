package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int reverse = int num;
		  int[] a = new int[6];
		  int i;
		  for (i = 0;i <= 5;i++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  }
		  for (i = 0;i <= 5;i++)
		  {
							   if (i == 0)
							   {
								  System.out.printf("%d",reverse(a[i]));
							   }
								  else
								  {
								  System.out.printf("\n%d",reverse(a[i]));
								  }
		  }
		  System.in.read();
		  System.in.read();
	}
	public static int reverse(int num)
	{
		int a = num;
		int x;
		int b = 0;
		for (;a != 0;)
		{
			   x = a % 10;
			   a = a / 10;
			   b = x + b * 10;

		}
		   return (b);
	}

}

