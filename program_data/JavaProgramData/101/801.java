package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
	 for (a = 0;a < 3;a++)
	 {
	  for (b = 0;b < 3;b++)
	  {
	   for (c = 0;c < 3;c++) //a,b,c???????0,1,2
	   {
		if ((a == 2 - (b > a) - (a == c)) && (b == 2 - (a > b) - (a > c)) && (c == 2 - (c > b) - (b > a))) //??????????
		{
														 //????2??????? 
		   if (a > b && b > c)
		   {
			   System.out.print("CBA");
		   }
		   else if (a > c && c > b)
		   {
			   System.out.print("BCA");
		   }
		   else if (b > c && c > a)
		   {
			   System.out.print("ACB");
		   }
		   else if (b > a && a > c)
		   {
			   System.out.print("CAB");
		   }
		   else if (c > a && a > b)
		   {
			   System.out.print("BAC");
		   }
		   else if (c > b && b > a)
		   {
			   System.out.print("ABC");
		   }
		}
	   }
	  }
	 }
	 return 0;
	}

}
