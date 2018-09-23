package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int Main_k;
	public static int Main() //?????
	{
	 int n; //??????n i
	 int i;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 if (n == 0) //??0???0
	 {
		System.out.print(0);
	 }

	 else
	 {
		for (i = 1;;i++) //?????
		{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	   static int k; //??????k???10?k??
		   if (i == 1) //??????k
		   {
			 Main_k = 10;
		   }
		   else
		   {
			   Main_k *= 10;
		   }
		   if (n < Main_k / 10) //???i???????
		   {
			 break; //???????????
		   }
		   else
		   {
			 int c = n % Main_k; //?????????????
			 System.out.print(c / (Main_k / 10));
		   }
		}
	 }

	  return 0;
	}
}

