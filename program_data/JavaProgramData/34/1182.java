package <missing>;

public class GlobalMembers
{
	public static int X(int m) //????
	{
	   if (m % 2 == 0) //?????????
	   {
		   System.out.print(m);
		   System.out.print("/2=");
		   System.out.print(m / 2);
		   System.out.print("\n");
		   m = m / 2;
		   if (m == 1) //????????1
		   {
			   System.out.print("End");
			   System.out.print("\n");
		   }
		   else
		   {
			   X(m); //????
		   }
	   }
	   else
	   {
		   System.out.print(m);
		   System.out.print("*3+1=");
		   System.out.print(m * 3 + 1);
		   System.out.print("\n");
		   m = m * 3 + 1;
		   if (m == 1)
		   {
			   System.out.print("End");
			   System.out.print("\n");
		   }
		   else
		   {
			   X(m);
		   }
	   }
	   return 0;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print("\n");
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else
		{
			X(n); //??????
		}
		return 0;
	}


}

