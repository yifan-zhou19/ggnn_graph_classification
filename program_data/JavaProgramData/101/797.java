package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int c;
	   for (a = 1;a < 4;a++) //?????a,b,c,??1???123???
	   {
	   for (b = 1;b < 4;b++)
	   {
		  if (b == a)
		  {
			  continue; //???????????????
		  }
		  for (c = 1;c < 4;c++)
		  {
			 if ((c == b) || (c == a))
			 {
				 continue;
			 }
			 if (((b > a) + (c == a) + a) != 3)
			 {
				 continue; //?????????????????123????????3???????????
			 }
			 if (((a > b) + (a > c) + b) != 3)
			 {
				 continue;
			 }
			 if (((c > b) + (b > a) + c) != 3)
			 {
				 continue;
			 }
			 if (a > b && b > c)
			 {
				 System.out.print("CBA");
				 System.out.print("\n");
			 }
			 if (a > c && c > b)
			 {
				 System.out.print("BCA");
				 System.out.print("\n");
			 }
			 if (b > a && a > c)
			 {
				 System.out.print("CAB");
				 System.out.print("\n");
			 }
			 if (b > c && c > a)
			 {
				 System.out.print("ACB");
				 System.out.print("\n");
			 }
			 if (c > b && b > a)
			 {
				 System.out.print("ABC");
				 System.out.print("\n");
			 }
			 if (c > a && a > b)
			 {
				 System.out.print("BAC");
				 System.out.print("\n");
			 }
		  }
	   }
	   }

	   return 0;
	}
}
