package <missing>;

public class GlobalMembers
{
	public static int panduan(int a,int b)
	{
	   if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
	   {
		   return 1;
	   }
	   else
	   {
		   return 0;
	   }
	}
	public static int Main()
	{
		int n;
		int res;
		int temp;
		int a;
		int b;
		res = 0;
		temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
		   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (panduan(a, b) != 0)
		   {
			   temp += 1;
		   }
		   else
		   {
			  if (temp > res)
			  {
				  res = temp;
			  }
			  temp = 0;
		   }
		}
		 if (temp > res)
		 {
			 res = temp;
		 }
		 System.out.print(res);
		 System.out.print("\n");
	return 0;
	}
}

